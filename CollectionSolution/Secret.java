import java.util.*;

class Secret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Solution Planning
        1. Read inputs (Recommend String)

        2. Split into parts
            Part 1: Digit 1 and Digit 2

            Part 2: Remaining 3 digits = number of steps

        3. Determine direction
            if part 1 is odd > left
            if part 1 is even > right
            if part 1 is 0 > previous direction 
        */
        String digits = "";
        String direction = "";
        while (digits.equals("99999") == false) {
            // Step 1: Get input
            System.out.println("Enter 5 digit instruction:");
            digits = sc.nextLine(); // we have a string
            if (digits.equals("99999") == false) {
                //int d1 = Integer.parseInt(digits.charAt(0));
                int d1 = Character.getNumericValue(digits.charAt(0));
                //int d2 = Integer.parseInt(digits.charAt(1));
                int d2 = Character.getNumericValue(digits.charAt(1));

                int last3 = Integer.parseInt(digits.substring(2, digits.length()));
                if (d1+d2 == 0) {
                    System.out.println(direction + " " + last3);
                } else if ((d1+d2) % 2 == 0) {
                    direction = "right";
                    System.out.println(direction + " " + last3);
                } else {
                    direction = "left";
                    System.out.println(direction + " " + last3);
                }
            }
        }
        sc.close();
    }
}
