package DSAProblems.BasicArrays;

import java.util.*;

 class UnionSortedArray {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < a.length && j < b.length) {

            // Case 1: a[i] is smaller
            if (a[i] < b[j]) {
                if (result.isEmpty() || result.get(result.size()-1) != a[i]) {
                    result.add(a[i]);
                }
                i++;

                // Case 2: b[j] is smaller
            } else if (a[i] > b[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != b[j]) {
                    result.add(b[j]);
                }
                j++;

                // Case 3: both equal
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                    result.add(a[i]);
                }
                i++;
                j++;
            }
        }

        // Remaining elements of a[]
        while (i < a.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                result.add(a[i]);
            }
            i++;
        }

        // Remaining elements of b[]
        while (j < b.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != b[j]) {
                result.add(b[j]);
            }
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 3, 5, 6};

        System.out.println(findUnion(a, b));
    }
}
