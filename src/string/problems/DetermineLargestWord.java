package string.problems;

import java.util.HashMap;
import java.util.Scanner;
public class DetermineLargestWord {

    public static void findWords(String input) {
        if(input == null)
            return;
        String words[] = input.split(" ");
        int largestWordLength=0;
        String largestWord"";
        for(int i=0; i<words.length;i++) {
            String word = words.[i];
            int len=word.length();
            if(len>largestWordLength) {
                largestWordLength = len;
                largestWords = word;
            }
            public static void main(String[] args) {
                System.out.println(" 10 biological")
            }
        /*

         Implement to Find the length and longest word in the given sentence below.
         Should return "10 = biological".
         */

        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);

        //implement


    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement

        return map;
    }
}
