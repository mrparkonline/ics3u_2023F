import java.util.*;

class Flipper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Flipper 
        // Step 1: Read string of Hs and Vs
        System.out.println("Enter Flipping Instructions");
        String input = sc.nextLine();
        // Step 2: Convert the string to a character array
        char[] instruction = input.toCharArray();
        // Step 3: Count the number of H and V
        int horizontal = 0;
        int vertical = 0;
        for (char i : instruction) {
            if (i == 'H') {
                horizontal += 1;
            } else {
                vertical += 1;
            }
        }
        // Step 4:
        //     if the number of H is even -> No change
        //     if the number of H is odd -> Just a single flip

        //     if the number of V is even -> No change
        //     if the number of V is odd -> just a single flip
        String line1 = "1 2";
        String line2 = "3 4";
        if (horizontal % 2 != 0 && vertical % 2 == 0) {
            // Horizontal Odd, Vertical Even
            line1 = "3 4";
            line2 = "1 2";
        } else if (horizontal % 2 == 0 && vertical % 2 != 0) {
            // Horizontal Even, Vertical Odd
            line1 = "2 1";
            line2 = "4 3";
        } else if (horizontal % 2 != 0 && vertical % 2 != 0) {
            // Horizontal Odd, Vertical Odd
            line1 = "4 3";
            line2 = "2 1";
        }
        else if (horizontal % 2 == 0 && vertical % 2 == 0) {
            // Both Even = No change
            line1 = "1 2";
            line2 = "3 4";
        }
        System.out.println(line1);
        System.out.println(line2);

        sc.close();
    }
}
