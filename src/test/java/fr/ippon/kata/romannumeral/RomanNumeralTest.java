package fr.ippon.kata.romannumeral;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {

    @Test
    public void test(){
        Assertions.assertTrue(true);
    }

    @Test
    public void test_given_1_then_rerurn_I (){
        assertEquals("I", RomanNumeral.covert(1));
    }

    @Test
    public void test_given_3_then_rerurn_III (){
        assertEquals("III", RomanNumeral.covert(3));
    }
}
