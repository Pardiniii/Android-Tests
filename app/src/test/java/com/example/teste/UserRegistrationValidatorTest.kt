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

    @Test
    fun testIsValidEmailFalse(){

        val userRegistrationValidator = UserRegistrationValidator()

        val email = userRegistrationValidator.isValidEmail("gustavoppardini@grupopancom")

        assertEquals(false, email)
    }

    @Test
    fun testIsValidPassWordFalse(){

        val userRegistrationValidator = UserRegistrationValidator()

        val senha = userRegistrationValidator.isValidPassword("senha")

        assertEquals(false, senha)
    }

    @Test
    fun testCanRegister(){

        val userRegistrationValidator = UserRegistrationValidator()

        val email = "gustavo.ppardini@grupopan.com"
        val senha = "senha0987"
        val pode = userRegistrationValidator.canRegister(email, senha)

        assertEquals(true, pode)
    }

    @Test
    fun testCanRegisterInvalidEmail(){

        val userRegistrationValidator = UserRegistrationValidator()

        val email = "gustavo.ppardinigrupopan.com"
        val senha = "senha0987"
        val pode = userRegistrationValidator.canRegister(email, senha)

        assertEquals(false, pode)
    }

    @Test
    fun testCanRegisterInvalidPassword(){

        val userRegistrationValidator = UserRegistrationValidator()

        val email = "gustavo.ppardini@grupopan.com"
        val senha = "senhaaaa"
        val pode = userRegistrationValidator.canRegister(email, senha)

        assertEquals(false, pode)
    }

    @Test
    fun testCanRegisterFalse(){

        val userRegistrationValidator = UserRegistrationValidator()

        val email = "gustavo.ppardinigrupopan.com"
        val senha = "senha09"
        val pode = userRegistrationValidator.canRegister(email, senha)

        assertEquals(false, pode)
    }




}