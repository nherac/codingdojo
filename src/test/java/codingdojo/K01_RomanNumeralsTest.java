package codingdojo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;
import static codingdojo.K01_RomanNumerals.*;

/*
* I, V, X, L, C, D, M.
* */

class K01_RomanNumeralsTest {

    @DisplayName("To-Do")
    @ParameterizedTest
    @CsvFileSource(resources = "/K01_RomanNumeral_01Test_number_letter")
    void testName(int number, String letter) {
        assertEquals(letter,translatorWithArray(number));

    }

    @DisplayName("Given an integer number -When cache is not populated- Then we got an string representing the roman number ")
    @ParameterizedTest
    @CsvFileSource(resources = "/K01_RomanNumeral_01Test_number_letter")
    void testName2(int number, String letter) {
        assertEquals(letter, getRomanNumberDynamic(number));

    }



}