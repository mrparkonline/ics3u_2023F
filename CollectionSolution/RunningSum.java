import java.util.*;
class RunningSum {
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
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int total_sum = 0;

        for (int num : nums) {
            total_sum += num;
            answer.add(total_sum);
        }

        System.out.println("The Running Sum of " + nums + " is: " + answer);

        sc.close();
    }
}
