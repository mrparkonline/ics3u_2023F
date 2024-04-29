// Given an array of integers nums, return the number of good pairs.

// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

import java.util.*;
class GoodPair {
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

        // Finding Good Pairs
        // nums[i] == nums[j] where i < j
        int good_pair = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    good_pair += 1;
                }
            }
        }
        System.out.println("Number of Good Pairs: " + good_pair);
        sc.close();
    }
}