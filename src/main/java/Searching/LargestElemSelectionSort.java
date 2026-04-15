package Searching;

public class LargestElemSelectionSort {

    public static int largestElement(int[] nums) {   // made static
        int max = nums[0];

        for(int i = 1; i < nums.length; i++) {   // FIXED
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int nums[] = {6, 3, 4, 7, 5, 10};

        // enhanced loop
        for(int le : nums){
            System.out.print(le + " ");   // FIXED
        }

        System.out.println();

        int result = largestElement(nums);

        System.out.println("Largest Element: " + result);  // print result
    }
}
