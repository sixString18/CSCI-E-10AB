package Pset32;

import java.util.Scanner;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/19/2015
 */
public class RealEstate {

    /**
     * This program evaluates a English sentence represented within a String data type and prints a subsequent String
     * sentence less any reoccurring vowels over the first initial vowels.
     *
     * In other words the String value "Desirable unfurnished flat in quiet residential area" should
     * result in the following: "Dsrbl unfrnshd flt in qt rsdntl ar"
     *
     * I was unable to accept accept user input through the Scanner class. I attempted several times, but due to
     * a lack of time vs. complexity scenario I resorted to evaluating the suggested String example outlined in
     * the Question. Included below in my comments are refactored suggestions I would have explored with more
     * available time.
     */
    public static void main(String[] args) {
//        System.out.println("Please enter an advertisement: ");
//        Scanner console = new Scanner(System.in);
//        String advertisement = console.nextLine();
        System.out.println("String advertisement = \"Desirable unfurnished flat in quiet residential area\"");
        String advertisement = "Desirable unfurnished flat in quiet residential area";
            System.out.println();
        System.out.println("firstWord_NoNoVowels(advertisement); ");
            System.out.println();
        firstWord_NoNoVowels(advertisement);
    }

    /**
     * This method counts the number of spaces within the passed String sentence which aids in the resulting method
     * call to NoNoVowels. Additionally this method is needed to parse the first word of the passed String sentence.
     *
     * @param s  represent an English sentence originally passed through main, entitled as a Real Estate advertisement.
     */
    public static void firstWord_NoNoVowels(String s) {

        int spaces = 0;
        int counter = 0;
        int length = s.length();

//        first word
        int aCounter= 0; int eCounter =0; int iCounter=0; int oCounter = 0; int uCounter = 0; int yCounter =0;
        NoNoVowels(s, aCounter,eCounter,iCounter,oCounter,uCounter,yCounter);

//        remaining words
        for (int j = 0; j < length; j++) {

            if (s.charAt(j) == ' ') {
                System.out.print(' ');
                NoNoVowels(eachWord(s, j),aCounter,eCounter,iCounter,oCounter,uCounter,yCounter);
                spaces++;
                spaces += j;
            }
        }
    }

    /**
     *  This method completed the removal of any secondary vowels present through the second word to the last word
     *  present within the String value originally passed through main. This method iterates over each character within
     *  each word of the the advertisement. Case sensitivity is ignored through a perhaps less efficient method as
     *  the method merely evaluates where the character is upper case or lowercase through continuous repetitions over
     *  each character. With more time I would have been interested in refactoring while using a String class method
     *  toLowerCase() or toUpperCase() and then of course translating back to a character data type. Additionally, with
     *  more available time I would like to cut down on the amount of unnecessary repetitions over non-vowel characters.
     *  Finally with just recently learning of Objects I would also have been interested in refactoring with a custom
     *  Object class.
     *
     * @param s represents a String value previously derived from the main method, defined as variable advertisement
     * @param counter1  represents a counter for vowel A
     * @param counter2  represents a counter for vowel E
     * @param counter3  represents a counter for vowel I
     * @param counter4  represents a counter for vowel O
     * @param counter5  represents a counter for vowel U
     * @param counter6  represents a counter for vowel Y
     */
    public static void NoNoVowels(String s, int counter1, int counter2, int counter3, int counter4, int counter5, int counter6) {
        String sOneVowel;
        for (int k = 0; k < 1; k++) {
            sOneVowel = eachWord(s, k);
            for (int kk = 0; kk < sOneVowel.length(); kk++) {

                if (counter1 == 1 && sOneVowel.charAt(kk) == 'a' || sOneVowel.charAt(kk) == 'A' ){
                    counter1++;
                }else{
                    counter1++;
                }
                if(counter2 == 1 && sOneVowel.charAt(kk) == 'e' || sOneVowel.charAt(kk) == 'E'){
                    counter2++;
                }else {
                    counter2++;
                }
                if (counter3 == 1 && sOneVowel.charAt(kk) == 'i' || sOneVowel.charAt(kk) == 'I'){
                    counter3++;
                }else {
                    counter3++;
                }
                if (counter4 == 1 && sOneVowel.charAt(kk) == 'o' || sOneVowel.charAt(kk) == 'O'){
                    counter4++;
                }else {
                    counter4++;
                }
                if (counter5 == 1 && sOneVowel.charAt(kk) == 'u' || sOneVowel.charAt(kk) == 'U'){
                    counter5++;
                }else {
                    counter5++;
                }
                if (counter6 == 1 && sOneVowel.charAt(kk) == 'y' || sOneVowel.charAt(kk) == 'Y') {
                    counter6++;
                } else{
                    counter6++;
                }
                if (sOneVowel.charAt(kk) != 'a' && sOneVowel.charAt(kk) != 'A'
                        && sOneVowel.charAt(kk) != 'e' && sOneVowel.charAt(kk) != 'E'
                        && sOneVowel.charAt(kk) != 'i' && sOneVowel.charAt(kk) != 'I'
                        && sOneVowel.charAt(kk) != 'o' && sOneVowel.charAt(kk) != 'O'
                        && sOneVowel.charAt(kk) != 'u' && sOneVowel.charAt(kk) != 'U'
                        && sOneVowel.charAt(kk) != 'y' && sOneVowel.charAt(kk) != 'Y'){
                    System.out.print(sOneVowel.substring(kk, kk + 1));
                } else if(sOneVowel.charAt(kk) == 'a' && counter1 < 2 || sOneVowel.charAt(kk) == 'A'  && counter1 < 2
                        ||  sOneVowel.charAt(kk) == 'e' && counter2 < 2 || sOneVowel.charAt(kk) == 'E'&& counter2 < 2
                        ||  sOneVowel.charAt(kk) == 'i' && counter3 < 2 || sOneVowel.charAt(kk) == 'I'&& counter3 < 2
                        ||  sOneVowel.charAt(kk) == 'o' && counter4 < 2 || sOneVowel.charAt(kk) == 'O'&& counter4 < 2
                        ||  sOneVowel.charAt(kk) == 'u' && counter5 < 2 || sOneVowel.charAt(kk) == 'U'&& counter5 < 2
                        ||  sOneVowel.charAt(kk) == 'y' && counter6 < 2 || sOneVowel.charAt(kk) == 'Y'&& counter6 < 2){
                    System.out.print(sOneVowel.substring(kk, kk + 1)); {
                    }
                }
            }
        }
    }

    /**
     * Learned of this method from chapter 5 of the Building Java Programs textbook. This method parses a series of
     * Strings (for this program the context of a series equates to an English sentence) and returns each individual
     * String separated by a space String value.
     *
     * @param s represents an English sentence based within a String data type
     * @param start represents the starting value in integer form
     * @return returns each word of the passed String sentence, each word is defined by a seperating space character.
     */
    public static String eachWord(String s, int start) {
//        int start = 0;
        while (start < s.length() && s.charAt(start) == ' ') {
            start++;
        }
        int stop = start;
        while (stop < s.length() && s.charAt(stop) != ' ') {
            stop++;
        }
        return s.substring(start, stop);
    }

}