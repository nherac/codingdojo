package codingdojo;

//https://codingdojo.org/kata/RomanNumerals/

import java.util.ArrayList;
import java.util.List;

public class K01_RomanNumerals {

    private static String[] cache;
    private static int MAX_ROMAN_NUMBERS = 4001;

    public static String getRomanNumber(int number){
        if(cache == null){
            cache = new String[MAX_ROMAN_NUMBERS];
        }
        if(cache[number] == null){
            var result = getRomanNumberDynamic(number);
            cache[number] = result;
            return result;
        }
        else
            return cache[number];

    }

    public static int sizeCache(){
        return cache.length;
    }



    private static String getRomanNumberDynamic(int number){
        StringBuilder result = new StringBuilder("");
        while(number>0){
            if(number>=1000){
                int numOfMile = number/1000;
                for (int i = 1; i <= numOfMile ; i++) {
                    result.append("M");
                }
                number = number % 1000;
            }
            if((number>=900) && (number<1000)){
                result.append("CM");
                number = number % 900;
            }
            if((number>=600) && (number<900)){
                int numOfCent = (number/100)-5;
                result.append("D");
                for (int i = 1; i <=numOfCent ; i++) {
                    result.append("C");
                }
                number = number % 100;
            }
            if(number<600 && number>=500){
                result.append("D");
                number = number % 100;
            }
            if(number<500 && number>=400){
                result.append("CD");
                number = number % 100;
            }
            if(number<400 && number >= 100 ){
                int numOfCent = number/100;
                for (int i = 1; i <=numOfCent ; i++) {
                    result.append("C");
                }
                number = number % 100;
            }
            if(number<100&& number>=90){
                result.append("XC");
                number = number % 90;
            }
            if(number<90  && number>50){
                result.append("L");
                int numberOfDec = (number/10)-5;
                for (int i = 1; i <=numberOfDec ; i++) {
                    result.append("X");
                }
                number = number % 10;
            }
            if(number<60 && number>=50){
                result.append("L");
                number  = number%50;
            }
            if(number<50 && number>=40){
                result.append("XL");
                number = number % 10;
            }
            if(number<40 && number>=10){
                int numberOfDec = (number/10);
                for (int i = 1; i <=numberOfDec ; i++) {
                    result.append("X");
                }
                number = number % 10;
            }
            if(number == 9){
                result.append("IX");
                number = 0;
            }
            if(number<9 && number >5){
                result.append("V");
                int units = number - 5;
                for (int i = 1; i <=units ; i++) {
                    result.append("I");
                }
                number = 0;
            }
            if (number == 5){
                result.append("V");
                number = 0;
            }
            if (number == 4){
                result.append("IV");
                number = 0;
            }
            if(number<4 && number >0){
                for (int i = 1; i <=number ; i++) {
                    result.append("I");
                }
                number = 0;
            }
        }

        return result.toString();
    }

}
