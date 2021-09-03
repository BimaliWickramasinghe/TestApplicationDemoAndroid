package com.bwicky.android.tesapplicationdemo

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    //Test case for adding two positive numbers
    @Test
    fun additionOfTwoPositiveNumbersShouldGiveTheCorrectSummation() {
        val value1 = 4
        val value2 = 1
        val sum = value1 + value2
        assertEquals(5, sum)
    }

    //Test case for adding two negative numbers
    @Test
    fun additionOfTwoNegativeNumbersShouldGiveTheCorrectSummation() {
        val value1 = -4
        val value2 = -1
        val sum = value1 - value2
        assertEquals(-3, sum)
    }

    //Test case for adding a positive number and a negative number
    @Test
    fun additionOfTwoPositiveAndNegativeNumbersShouldGiveTheCorrectSummationAndSignOfTheLargestNumber() {
        val value1 = 4
        val value2 = -1
        val sum = value1 - value2
        assertEquals(3, sum)
    }

    //Test case for a String
    @Test
    fun stringShouldMatchWithTheGivenString() {
        val myString = "My String"
        assertEquals("My String", myString)
    }

    //Test case for an Object
    @Test
    fun stringShouldMatchW() {
        val myString = "My String"
        assertEquals("My String", myString)
    }

    //Test case for adding a positive number and a negative number
    @Test
    fun stringShouldMatchWithTeGivenString() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.bwicky.android.tesapplicationdemo", appContext.packageName)
    }
}