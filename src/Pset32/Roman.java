package Pset32;

import java.util.Scanner;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/11/2015
 */
public class Roman {
    /** THIS PROBLEM IS FOR EXTRA CREDIT ********
     *
     * This program attempts to convert Roman Numeral Syntax into Arabic equivalents.
     * Due to a lack of time vs. complexity, the program does not completely convert all Roman Numeral syntax.
     * Below represents my extra credit attempt.
     */
    public static void main(String[] args) {
        System.out.println("System.out.println(romanToArabic(\"LXXXVII\"));");
        System.out.println(romanToArabic("LXXXVII"));       // 87
        System.out.println("System.out.println(romanToArabic(\"CCXIX\"));");
        System.out.println(romanToArabic("CCXIX"));         // 219
        System.out.println("System.out.println(romanToArabic(\"MCCCLIV\"));");
        System.out.println(romanToArabic("MCCCLIV"));       // 1354
        System.out.println("System.out.println(romanToArabic(\"MMDCLXXIII\"));");
        System.out.println(romanToArabic("MMDCLXXIII"));    // 2673
        System.out.println("System.out.println(romanToArabic(\"MCDLXXVI\"));");
        System.out.println(romanToArabic("MCDLXXVI"));      // 1476
    }

    /**
     * This method evaluates each character within the Roman Numeral syntax originally passed by main.
     *
     * @param s represents the Roman Numeral String passed by the main method.
     * @return  represents the Arabic equivalent to the passed parameter s
     */
    public static int romanToArabic(String s){
        int M = 1000;
        int D = 500;
        int C = 100;
        int L = 50;
        int X = 10;
        int V = 5;
        int I = 1;

        s = s.toUpperCase();
        int a_number = 0;
        int aa = s.length();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'M') {
                a_number += M;
            }else if (s.charAt(i) == 'I' && s.charAt(i) != s.length()-1 ||
                    s.charAt(i) == 'I' && s.charAt(i+1) != 'V'){
                a_number += I;
            }else if (s.charAt(i) == 'D'){
                a_number+= D;
            }else if (s.charAt(i) == 'C'){
                a_number+= C;
            }else if (s.charAt(i) == 'L') {
                a_number += L;
            }else if (s.charAt(i) == 'I' && s.charAt(i+1) == 'V'){
                a_number+= 4;
            }else if (s.charAt(i) == 'V' && s.charAt(i-1) != 'I'){
                a_number+= V;
            }else if (s.charAt(i) == 'I' && s.charAt(i) != s.length()-1 ||
                    s.charAt(i) == 'I' && s.charAt(i+1) == 'X'){
                a_number+= 9;
            }else if (s.charAt(i) == 'X' && s.charAt(i-1) != 'I'){
                a_number+= X;
            }
        }
        return a_number;
    }
}