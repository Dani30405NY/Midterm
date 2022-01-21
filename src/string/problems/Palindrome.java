package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversedand it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
          Hannah is a Palindrome!!!
         */
        String a = "hannah";
        String reverse ="";
        for(int i= a.length() -1; i >0; i--) {
            reverse += a.charAt(i);
            boolean palindrome = true;
            for (int i = 0; i < a.length(); i++) {
                if (original.charAt(i) != reverse.charAt(i)) {
                    palindrome = false;
                }
                if (palindrome) {
                    System.out.println("Yes, Palindrome!");
                } else {
                    System.out.println("No, not a Palindrome!");
                }
            }



