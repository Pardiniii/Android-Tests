package com.example.teste

import kotlin.test.Test
import kotlin.test.assertEquals

class UserRegistrationValidatorTest {

    @Test
    fun testIsValidEmail(){

        val userRegistrationValidator = UserRegistrationValidator()

        val email = userRegistrationValidator.isValidEmail("gustavo.ppardini@grupopan.com")

        assertEquals(true, email)
    }

    @Test
    fun testIsValidPassWord(){

        val userRegistrationValidator = UserRegistrationValidator()

        val senha = userRegistrationValidator.isValidPassword("senha123")

        assertEquals(true, senha)
    }


}