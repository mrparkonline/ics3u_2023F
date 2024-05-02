import java.util.*;
class LeftRight {
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

        // Left Sum Array Maker
        ArrayList<Integer> leftSum = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            int total_left = 0;
            if (i == 0) {
                leftSum.add(total_left);
            } else {
                for (int j = i-1; j > -1; j--) {
                    total_left += nums.get(j);
                }
                leftSum.add(total_left);
            }
        }
        System.out.println("Left Sum Array: " + leftSum);
        // Left Sum Array Maker Complete

        // Right Sum Array Maker
        ArrayList<Integer> rightSum = new ArrayList<Integer>();
        for (int i = nums.size()-1; i > -1; i--) {
            int total_right = 0;
            if (i == nums.size()-1) {
                rightSum.add(total_right);
            } else {
                for (int j = i+1; j < nums.size(); j++) {
                    total_right += nums.get(j);
                }
                rightSum.add(total_right);
            }
        }
        // For the right sum ... we need to reverse the order.
        int i = 0;
        int j = rightSum.size() - 1;
        while (i < j) {
            int temp = rightSum.get(i);
            rightSum.set(i, rightSum.get(j));
            rightSum.set(j, temp);

            i += 1;
            j -= 1;
        }
        System.out.println("Right Sum Array: " + rightSum);

        // Answer
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for (int k = 0; k < leftSum.size(); k++) {
            int left = leftSum.get(k);
            int right = rightSum.get(k);

            int total_diff = left - right;
            if (total_diff < 0) {
                total_diff = total_diff * -1;
            } 
            answer.add(total_diff);
        }
        
        System.out.println("The Left Right Sum: " + answer);

        sc.close();
    }
}
