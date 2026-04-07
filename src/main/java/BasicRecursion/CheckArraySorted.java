package BasicRecursion;

public class CheckArraySorted {

    public boolean checkSorted(int arr[], int i) {

        // Step 1: Base case
        if (i == arr.length - 1) {
            return true;
        }

        // Step 2: Check current pair
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        // Step 3: Check next
        return checkSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        CheckArraySorted c = new CheckArraySorted();

        int arr[] = {1, 2, 3, 4, 5};

        System.out.println(c.checkSorted(arr, 0));
    }
}