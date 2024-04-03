/*5. Create a program to check upon two strings. 

If one of the strings is found at the end of the word, output/return True … otherwise output/return False. The program is not case sensitive.
*/

import java.util.Scanner;

class Q5 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        // Step 1: Get inputs
        System.out.println("Enter two words:");
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        // Step 2: Make each words lowercased
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        // Step 3: Check if they are equal
        if (word1.equals(word2)) {
            System.out.println("True");
        } else {
            // Step 4: Check if they ends with each other
            if (word1.endsWith(word2)) {
                System.out.println("True");
            } else if (word2.endsWith(word1)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

        sc.close();
    }
}