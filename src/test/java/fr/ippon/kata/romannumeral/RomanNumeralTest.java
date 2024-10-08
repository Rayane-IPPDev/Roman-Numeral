package fr.ippon.kata.romannumeral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static fr.ippon.kata.romannumeral.RomanNumeral.RomainCalc;

public class RomanNumeralTest {

    @Test
    public void test(){
        Assertions.assertTrue(true);
    }

    @Test
    public void Test_UN() {

        final int int_un = 1;

        final String result = RomainCalc(int_un);

        Assertions.assertEquals("I", result);
    }


    @Test
    public void Test_table() {

        final int MAX = 3;

        List<String> table_result = new ArrayList<>();

        for(int i=1; i<=MAX; i++){
            final String result = RomainCalc(i);
            table_result.add(result);
        }


        Assertions.assertEquals("I", table_result.get(0));
        Assertions.assertEquals("II", table_result.get(1));
       Assertions.assertEquals("III", table_result.get(2));



    }


}
