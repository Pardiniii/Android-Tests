package com.example.teste

import org.junit.Test
import kotlin.test.assertEquals

class CpfValidatorTest {

    @Test
    fun shouldReturnTrueWhenCpfIsValid(){
        val cpfValidator = CpfValidator()
        val cpf = "529.982.247-25"

        val valid = cpfValidator.isValid(cpf)

        assertEquals(true, valid)

    }

}