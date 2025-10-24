package com.example.teste

class UserRegistrationValidator {

    fun isValidEmail(email: String): Boolean {
        return email.contains("@") && email.contains(".")
    }

    fun isValidPassword(password: String): Boolean {
        return password.length >= 8 && password.any { it.isDigit() }
    }

    fun canRegister(email: String, password: String): Boolean {
        return isValidEmail(email) && isValidPassword(password)
    }
}