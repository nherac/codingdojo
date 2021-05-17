package codingdojo;

//https://codingdojo.org/kata/RomanNumerals/

import java.util.List;

public class K01_RomanNumerals {
    //brute force solution until 4000 items.
    //populate an array or ArrayList with 4000 items. Because Array access by index, then, each index would be the
    //number.
    static String[] translatorArray1 = {"","I","II", "III", "IV","V", "VI","MMMM"};
    List translatorWithList = List.of("", "I","II", "III", "V" ,"IV", "VI","MMMM");


    public static String translatorWithArray(int numberIWantToConvert) {
        // populate the array
        return translatorArray[numberIWantToConvert];

    }

    public static String translatorWithList(int numberIWantToConvert){
        return translatorWithList(numberIWantToConvert);
    }

    static int maxNumber = 4000+1;
    static String[] translatorArray = new String[maxNumber];
    public static void populateArray(){

        for(int i=1;i<=maxNumber;i++){
            translatorArray[i] = getRomanNumberDynamic(i);

        }

    }

    public static String getRomanNumberDynamic(int number){
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
