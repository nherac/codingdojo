package codingdojo;

//https://codingdojo.org/kata/RomanNumerals/

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class K01_RomanNumerals {
    //brute force solution until 4000 items.
    //populate an array or ArrayList with 4000 items. Because Array access by index, then, each index would be the
    //number.
    static String[] translatorArray = {"","I","II", "III", "IV","V", "VI","MMMM"};
    List translatorWithList = List.of("", "I","II", "III", "V" ,"IV", "VI","MMMM");


    public static String translatorWithArray(int numberIWantToConvert) {
        // populate the array
        return translatorArray[numberIWantToConvert];

    }

    public static String translatorWithList(int numberIWantToConvert){
        return translatorWithList(numberIWantToConvert);
    }





}
