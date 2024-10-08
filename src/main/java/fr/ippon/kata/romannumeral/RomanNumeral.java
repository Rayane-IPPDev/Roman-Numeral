package fr.ippon.kata.romannumeral;

import org.apache.commons.lang3.StringUtils;

public class RomanNumeral {

    public static void main(String[] args) {
        System.out.println("Test");
    }

    public static String RomainCalc(int num){
        String result = "I";
        if(num <= 3){
            result = StringUtils.repeat(result, num);
        }



        return result;

    }


}
