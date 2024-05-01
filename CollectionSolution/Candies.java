import java.util.*;
class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList set up
        ArrayList<Integer> candies = new ArrayList<Integer>();
        while (true) {
            System.out.println("Enter number of candies; type EXIT to stop.");
            String input = sc.nextLine();
            if (input.equals("EXIT")) {
                break;
            } else {
                candies.add(Integer.parseInt(input));
            }
        } // End of ArrayList set up
        System.out.println("Enter number of extra candies:");
        int extra = Integer.parseInt(sc.nextLine());

        // To Do
        // 1. Find the maximum number of candies
        int largest = candies.get(0);
        for (int i = 1; i < candies.size(); i++) {
            if (candies.get(i) > largest) {
                largest = candies.get(i);
            }
        }

        // 2. for each candy count; add the extra
        //      if the new total is greater or equal to the maximum, add true
        //      else add false
        ArrayList<Boolean> answer = new ArrayList<Boolean>();
        for (int candy_count : candies) {
            if (candy_count + extra >= largest) {
                answer.add(true);
            } else {
                answer.add(false);
            }
        }
        System.out.println("Answer: " + answer);
        sc.close();
    }
}
