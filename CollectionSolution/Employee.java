import java.util.*;
class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Int Array Input
        System.out.println("Input Array Size");
        int size = Integer.parseInt(sc.nextLine());
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Input an integer value in array:");
            nums[i] = Integer.parseInt(sc.nextLine());
        }

        // Finding good employees who have worked
        // more or equal to target hours
        System.out.println("Enter the target hours:");
        int target = Integer.parseInt(sc.nextLine());

        int good_counter = 0;
        for (int hour : nums) {
            if (hour >= target) {
                good_counter += 1;
            }
        }
        System.out.println("Number of good employees: " + good_counter);
        sc.close();
    }
}