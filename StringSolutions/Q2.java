/* 2. Vowels vs Consonants

Create a program such that it determines if there are more vowels than consonants in the given inputted string. Assume that input is all lowercase and that y is a consonant
*/

import java.util.Scanner;

class Q2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        // Step 1: Get input
        System.out.println("Enter a word:");
        String word = sc.nextLine();
        word = word.toLowerCase(); // made it all lowercased

        // Step 2: Create character array for a for each loop
        char[] char_word = word.toCharArray(); // This is because we can't use a for each loop on a String

        // Step 3: Create vowel and consonants counter
        int vowels = 0;
        int consonants = 0;

        for (char c : char_word) {
            // Step 4: Check if c is a vowel, if so increase counter
            if (c == 'a' || c == 'e' || c == 'i') {
                vowels++;
            } else if (c == 'o' || c == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        // Step 4: Conditional Output to see which is greater
        if (vowels > consonants) {
            System.out.println("There are more vowels!");
        } else {
            System.out.println("There are more consonants!");
        }

        sc.close();
    }
}