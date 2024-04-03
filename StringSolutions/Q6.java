/* 6. Most Occurring Character

Determine the most used letter in a string.
*/ 
import java.util.Scanner;

class Q6 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input
        System.out.println("Enter a word:");
        String word = sc.nextLine();

        // Step 2: Create placeholder variables
        String winner = "";
        int size = word.length();
        int amount = -1*size;

        // Step 3: Calculate the occurance by:
        // size - length(current character removed from word)

        char[] char_word = word.toCharArray();
        for (char c : char_word) {
            String target = "";
            target += c;
            String word_copy = word.replace(target, "");
            int diff = size - word_copy.length();

            if (diff > amount) {
                winner = "";
                winner += c;
                amount = diff;
            }
        }

        System.out.println("Winner: " + winner);
        System.out.println("Occurence: " + amount);

        sc.close();
    }
}