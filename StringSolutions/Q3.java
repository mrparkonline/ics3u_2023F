/* 2023W - 3. Palindrome Checker

Create a program that determines if the two inputted words are palindromes

Palindrome: a word, phrase, or sequence that reads the same backward as forward, e.g., madam
*/

import java.util.Scanner;

class Q3 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input
        System.out.println("Enter a word:");
        String word = sc.nextLine();

        // Step 2: Create an empty string to hold the reversed word.
        String reverse = "";

        // Step 3: Using .charAt() grab characters at a certain index
        // Last character of a word is at length of word - 1

        for (int i=word.length()-1; i > -1; i--) {
            char c = word.charAt(i); // This grabs the character at i
            reverse += c; // This adds character c to reverse
        }
        
        // Step 4: Check if reverse == word
        word = word.toLowerCase().replace(" ", "");
        reverse = reverse.toLowerCase().replace(" ", "");

        if (word.equals(reverse)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
        sc.close();
    }
}