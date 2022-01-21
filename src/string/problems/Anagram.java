package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        //1. Check the length of the strings
        //2. Change strings to characters
        //3. Use iteration to compare the letters

        String s1 = "bad credit";
        String s2 = "debit card";

        if (anagramCheck(s1, s2)) {
            System.out.println("Yes, it is an Anagram");
        }
        else {
            System.out.println("Not an Anagram");
        }
    }
    //checking if both array's are the same length
    static boolean anagramCheck(String s1, Strings s2) {
        if (s1.length != s2.length()) {
            return false;
        }
        //changing strings to characters
        char string1ToArray[] = s1.toCharArray();
        char string2ToArray[] = s2.toCharArray();

        //
        Arrays.sort(string1ToArray);
        Arrays.sort(string2ToArray);

        for (int i = 0; i < s1.length(); i++) {
            if (string1ToArray[i] != string1ToArray[i]) {
                return false;
            }
        }
        return true;

    }
}
