import java.util.*;
class Review4 {
    public static void main(String[] args) {
        // If a string contains the character, add the index
        Scanner sc = new Scanner(System.in);
        // ArrayList set up
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.println("Enter a string; type EXIT to stop.");
            String input = sc.nextLine();
            if (input.equals("EXIT")) {
                break;
            } else {
                words.add(input);
            }
        } // End of ArrayList set up
        System.out.println("Enter a target character:");
        String target = sc.nextLine();

        ArrayList<Integer> answer = new ArrayList<Integer>(); // Store answers here

        for (int i = 0; i < words.size(); i++) {
            String current_word = words.get(i);

            if (current_word.contains(target)) {
                System.out.println(target + " is found in: " + current_word);
                answer.add(i);
            }
        }
        System.out.println("Our answer: " + answer);

        sc.close();
    }
}
