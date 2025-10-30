package com.example.teste

import org.junit.Test
import kotlin.test.assertEquals

class CpfValidatorTest {

    @Test
    fun shouldReturnTrueWhenCpfIsValid(){
        val cpfValidator = CpfValidator()
        val cpf = "52998224725"

        val valid = cpfValidator.isValid(cpf)

        assertEquals(true, valid)

    }

    @Test
    fun shouldReturnFalseForCpfWithAllSameDigits(){
        val cpfValidator = CpfValidator()
        val cpf = "000.000.000-00"

        val valid = cpfValidator.isValid(cpf)

        assertEquals(false, valid)
    }

    @Test
    fun shouldReturnFalseForCpfWithInvalidLength(){
        val cpfValidator = CpfValidator()
        val cpf = "000.000.0-00"

        val valid = cpfValidator.isValid(cpf)

        assertEquals(false, valid)
    }

    @Test
    fun shouldReturnFalseForCpfWithWrongVerifierDigits(){
        val cpfValidator = CpfValidator()
        val cpf = "000.000.000-44"

        val valid = cpfValidator.isValid(cpf)

        assertEquals(false, valid)
    }

    @Test
    fun shouldReturnTrueForCpfWithPoints(){
        val cpfValidator = CpfValidator()
        val cpf = "529.982.247-25"

        val valid = cpfValidator.isValid(cpf)

        assertEquals(true, valid)
    }

}