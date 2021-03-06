package Pset32;

import java.util.Scanner;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/10/2015
 */
public class Pencil_and_Paper_Exercises {
    public static void main(String[] args) {
/*        String s = "Java, Java, Java";
        System.out.println(s.substring(0, 4)); // == "Java" True
        System.out.println(s.lastIndexOf("av")); // 13
        System.out.println(s.indexOf('a', 5)); // 7
        System.out.println(s.indexOf("a", s.length() - 1)); // 7
        System.out.println(s.substring(s.lastIndexOf(s.charAt(5)))); // Java
        System.out.println(s.substring (2, s.length() - 3)); // va, Java, J*/

//        System.out.println(printLetters("Rabbit"));
//        printLetters("Rabbitsssssssssssssss");
/*
        mystery(-2,-6); // 0
        mystery(2,3);   // 0 1 1
        mystery(4,8);   // 0 3 5 6
        mystery(10,31); // 0 9 17 24 30
*/
        Scanner console = new Scanner(System.in);
        System.out.print("Please type a string:  ");
        System.out.println(sentenceType(console.nextLine()));
    }

    public static String sentenceType(String s){
            if (s.lastIndexOf(s.charAt(s.length()-1)) == '!'){
                return "exclamatory";
            } else if(s.lastIndexOf(s.charAt(s.length()-1)) == '?'){
                return "interrogative";
            }else if (s.lastIndexOf(s.charAt(s.length()-1)) == '.'){
                return "declarative";
            }else {
                return "bad ending";
            }
        }

    public static void printLetters (String text)
    {
        for (int i = 0; i < text.length(); i++)
        {
            System.out.print(text.charAt(i));

            if (i < text.length()-1) {
                System.out.print("-");
            }
        }
        System.out.println(); // to end the line of output
    }

    public static void mystery (int x, int y)
    {
        int s = 0;
        while (x > 0 && 2 * y >= x)
        {
            System.out.print(s + " ");
            y = y - x;
            x--;
            s = s + x;
        }
        System.out.println (s);
    }
    public static String firstWord(String s){
        int start = 0;
        while (start < s.length() && s.charAt(start) == ' '){
            start++;
        }

        int stop = start;
        while (stop < s.length() && s.charAt(stop) != ' '){
            stop++;
        }
        return s.substring(start,stop);
    }
}
