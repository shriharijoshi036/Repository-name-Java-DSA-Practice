package Searching;

class LinearSearch {

    public static int linearSearch(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i; // found
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 7, 9, 11};
        int target = 11;

        int result = linearSearch(nums, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}