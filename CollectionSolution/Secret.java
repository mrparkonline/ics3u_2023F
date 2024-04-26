import java.util.*;

class Secret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Secret Instructions
        // Step 1: Repeatedly read inputs + initialize directions
        String input = "";
        String direction = "";
        while (input.equals("99999") == false) {
            System.out.println("Instructions")
            input = sc.nextLine();

            if (input.equals("99999") == false) {
                // Step 2: Separate into digits
                String d1 = "" + input.charAt(0);
                int digit1 = Integer.parseInt(d1);

                String d2 = "" + input.charAt(1);
                int digit2 = Integer.parseInt(d2);

                // Step 3: Obtain Last 3 Digits
                String last3 = input.substring(2, input.length());
                int steps = Integer.parseInt(last3);

                // Step 4: Add digit1 and digit2 for left/right
                if (digit1 + digit2 == 0) {
                    System.out.println(direction + " " + steps);
                } else if ((digit1 + digit2) % 2 == 0) {
                    direction = "right";
                    System.out.println(direction + " " + steps);
                } else {
                    direction = "left";
                    System.out.println(direction + " " + steps);
                }
            }
        }

        sc.close();
    }
}
