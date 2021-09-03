package com.bwicky.android.tesapplicationdemo


import android.accounts.Account
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest {

    lateinit var calculator: Calculator
    lateinit var userDetails: UserDetails
    lateinit var schoolDetails: SchoolDetails

    @Before
    fun setUpCalculator(){
        calculator = Calculator()
    }

    @Before
    fun setUpUserDetails(){
        userDetails = UserDetails()
    }

    @Before
    fun setUpSchoolDetails(){
        schoolDetails = SchoolDetails()
    }

    @Test
    //Adding two positive integers
    fun addition_ofTwo_Negative_Numbers_Should_Give_aPositive_Summation() {
        val sum = calculator.add(4, 5)
        assertEquals(9, sum)
    }

    @Test
    //Adding two negative integers
    fun addition_ofTwo_Negative_Numbers_Should_Give_aNegative_Summation() {
        val sum = calculator.add(-4, -5)
        assertEquals(-9, sum)
    }

    @Test
    //Adding a smaller negative integer and a larger positive integer
    fun addition_of_aSmaller_Negative_Integer_with_aLarger_Positive_Integer_Gives_aPositive_Summation() {
        val sum = calculator.add(-4, +5)
        assertEquals(1, sum)
    }

    @Test
    //Adding a smaller positive integer and a larger negative integer
    fun addition_of_aSmaller_Positive_Integer_with_aLarger_Negative_Integer_Gives_aPositive_Summation() {
        val sum = calculator.add(4, -5)
        assertEquals(-1, sum)
    }

    @Test
    //Adding a positive integer and zero
    fun addition_of_aPositive_Integer_with_Zero_Gives_the_Same_Integer() {
        val sum = calculator.add(4, 0)
        assertEquals(4, sum)
    }

    @Test
    //Adding a negative integer and zero
    fun addition_of_aNegative_Integer_with_Zero_Gives_the_Same_Integer() {
        val sum = calculator.add(-4, 0)
        assertEquals(-4, sum)
    }


    @Test
    //String test case
    fun should_Give_the_Correct_String() {
        val outputString = userDetails.sayHello("Bimali")
        assertEquals("Hello Bimali", outputString)
    }

    @Test
    //Power of a positive integer
    fun power_of_a_Positive_Integer_isPositive() {
        val power = calculator.powerOf(4)
        assertEquals(16, power)
    }

    @Test
    //Power of a negative integer
    fun power_of_a_Negative_Integer_isPositive() {
        val power = calculator.powerOf(-4)
        assertEquals(16, power)
    }

    @Test
    //Power of a negative integer
    fun power_of_a_Negative_Integer_isNot_Negative() {
        val power = calculator.powerOf(-4)
        assertNotEquals(-16, power)
    }

    @Test
    //Power of zero
    fun power_of_Zero_Should_be_Zero() {
        val power = calculator.powerOf(0)
        assertEquals(0, power)
    }

    @Test
    //should_Return_the_Corresponding_Address_ofThe_Given_School
    fun should_Return_Correct_School_Address(){
        schoolDetails.addSchoolDetails("mbv","Kurunegala")
        schoolDetails.addSchoolDetails("icc","Ibbagamuwa")
        var address = schoolDetails.findSchoolAddress("mbv")
        assertEquals("Kurunegala", address)
    }

    @Test
    //should_Return_the_Corresponding_Address_ofThe_Given_School
    fun should_Not_Return_False_Address(){
        schoolDetails.addSchoolDetails("mbv","Kurunegala")
        schoolDetails.addSchoolDetails("icc","Ibbagamuwa")
        var address = schoolDetails.findSchoolAddress("mbv")
        assertNotEquals("Ibbagamuwa", address)
    }

    @Test
    //should_Return_the_Corresponding_Address_ofThe_Given_School
    fun return_String_Should_Not_Be_Null(){
        schoolDetails.addSchoolDetails("mbv","Kurunegala")
        schoolDetails.addSchoolDetails("icc","Ibbagamuwa")
        var address = schoolDetails.findSchoolAddress("mbv")
        assertNotNull(address)
    }
}