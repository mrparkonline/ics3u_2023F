/* 4. String Flip

Given a string, flip the string where the second half of the word is moved to the front.
*/ 
import java.util.Scanner;

class Q4 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        // Step 1: Get input
        System.out.println("Enter a word:");
        String word = sc.nextLine();
        
        // Step 2: Midpoint
        int mid = word.length() / 2; 

        // Step 3: Create empty halves
        String front = "";
        String back = "";

        // Step 4: If the index is before middle, add to front, else: add to back
        for (int i=0; i < word.length(); i++) {
            if (i < mid) {
                front += word.charAt(i);
            } else {
                back += word.charAt(i);
            }
        }

        String result = back + front; // flipped result

        System.out.println(word + " flipped: " + result);

        sc.close();
    }
}