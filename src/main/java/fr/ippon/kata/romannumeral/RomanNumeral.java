package fr.ippon.kata.romannumeral;

public class RomanNumeral {

    public static void main(String[] args) {
        System.out.println("Test");
    }

    public static String covert(int i) {
        if (i<4) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < i +1; j++) {
                sb.append("I");
            }
            return sb.toString();
        }
        return null;
    }
}
