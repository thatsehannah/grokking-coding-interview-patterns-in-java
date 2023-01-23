package two_pointers;

import java.util.Arrays;

public class SumOfThreeValues {
    public static void main(String[] args) {
        int[] arr1 = {-1, 2, 1, -4, 5, -4};
        int[] arr2 = {3, 7, 1, 2, 8, 4, 5};
        int[] arr3 = {1, -1, 0};

        System.out.println("Does " + Arrays.toString(arr1) + " have 3 values that sum up to 7? " + findSumOfThree(arr1, 7));
        System.out.println("Does " + Arrays.toString(arr2) + " have 3 values that sum up to 20? " + findSumOfThree(arr2, 20));
        System.out.println("Does " + Arrays.toString(arr3) + " have 3 values that sum up to -1? " + findSumOfThree(arr3, -1));
    }

    static boolean findSumOfThree(int[] nums, int target) {
        int lowPointer, highPointer;

        // It's important to sort the array first to ensure that this function works
        Arrays.sort(nums); // does quicksort in the background, so big O is n*logn

        // loop's big O is n^2
        for (int i = 0; i < nums.length; i++) {
            lowPointer = i + 1; // Index of pointer that points to the first of the remaining elements
            highPointer = nums.length - 1; // Index of pointer that points to the last element in the array

            while (lowPointer < highPointer) {
                int sum = nums[i] + nums[lowPointer] + nums[highPointer];
                if (sum == target) {
                    // System.out.println(nums[i] + ", " + nums[lowPointer] + ", " + nums[highPointer]);
                    return true;
                }

                if (sum > target) {
                    highPointer--; // Decrement the high pointer if the calculated sum is greater than the target
                } else {
                    lowPointer++; // Increment the low pointer if the calculated sum is less than the target
                }
            }
        }

        return false;
    }
}
