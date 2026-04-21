package DSAProblems.BasicArrays;

public class LinearSearch {

    public int searchNumber(int arr[], int n) {

        int num = 4;  // number to search

        // 🔹 Traverse array
        for (int i = 0; i < n; i++) {

            // 🔹 If element found → return index
            if (arr[i] == num) {
                return i;
            }
        }

        // 🔹 If not found → return -1
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,0,3,0,4,5,0,6,7};
        int n = arr.length;

        LinearSearch ls = new LinearSearch();

        // 🔹 Store result
        int result = ls.searchNumber(arr, n);

        // 🔹 Check result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}