package com.example.teste

class CpfValidator {

    fun isValid(cpf: String): Boolean {
        val cleanCpf = cpf.filter { it.isDigit() }

        if (cleanCpf.length != 11 || cleanCpf.all { it == cleanCpf[0] }) return false

        val firstNineDigits = cleanCpf.substring(0, 9).map { it.toString().toInt() }
        val firstVerifier = calculateVerifierDigit(firstNineDigits, startWeight = 10)

        val firstTenDigits = firstNineDigits + firstVerifier
        val secondVerifier = calculateVerifierDigit(firstTenDigits, startWeight = 11)

        return cleanCpf == (firstNineDigits + firstVerifier + secondVerifier).joinToString("")
    }

    private fun calculateVerifierDigit(digits: List<Int>, startWeight: Int): Int {
        val sum = digits.mapIndexed { index, digit -> digit * (startWeight - index) }.sum()
        val remainder = sum % 11
        return if (remainder < 2) 0 else 11 - remainder
    }
}