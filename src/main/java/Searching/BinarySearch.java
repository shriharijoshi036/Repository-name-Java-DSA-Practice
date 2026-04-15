package Searching;

public class BinarySearch {

    public static int binarySearch(int nums[], int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid; // found
            }
            else if (nums[mid] < target) {
                left = mid + 1; // move right
            }
            else {
                right = mid - 1; // move left
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 7, 9, 11};
        int target = 11;

        int result = binarySearch(nums, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}