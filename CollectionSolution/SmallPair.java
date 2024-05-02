import java.util.*;
class SmallPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Integer ArrayList setup
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while (true) {
            System.out.println("Enter a number. X to exit.");
            String input = sc.nextLine();
            if (input.equals("X")) {
                break;
            } else {
                nums.add(Integer.parseInt(input));
            }
        }
        // End of setup
        System.out.println("Enter a target integer.");
        int target = Integer.parseInt(sc.nextLine());
        int counter = 0; // Answer counter
        for (int i=0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                int current_sum = nums.get(i) + nums.get(j);
                if (current_sum < target) {
                    counter += 1;
                }
            }
        }
        System.out.println("Number of pairs less than the target: " + counter);

        sc.close();
    }
}
