package com.example.teste

import org.junit.Test
import org.junit.Assert.assertEquals

class TemperatureConverterTest {

    @Test
    fun testCelciusToFahrenheit(){
        //Arrange
        val temperatureConverter = TemperatureConverter()

        //Act
        val valor = temperatureConverter.celsiusToFahrenheit(30.0)

        //Assert
        assertEquals(86.0, valor, 0.001)
    }

    @Test
    fun testFahrenheitToCelcius(){

        val temperatureConverter = TemperatureConverter()

        val valor = temperatureConverter.fahrenheitToCelsius(104.0)

        assertEquals(40.0, valor, 0.001)
    }
}