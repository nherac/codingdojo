package codingdojo;

//https://codingdojo.org/kata/RomanNumerals/

import java.util.HashMap;
import java.util.Map;

public class K01_RomanNumerals {

    static Map<Integer,String> basic;
    static {
        basic = new HashMap<>();
        basic.put(1,"I");
        basic.put(5,"V");
        basic.put(10,"X");
        basic.put(50,"L");
        basic.put(100,"C");
        basic.put(500, "D");
        basic.put(1000, "M");

    }


    public static String translate(int number) {

        return basic.get(number);

    }
}
