package DSAProblems.BasicArrays;

import java.util.Scanner;

public class checkSorted {

    public boolean isSorted(int a[], int n) {
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                // do nothing, continue
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // create object
        checkSorted obj = new checkSorted();

        // call method and print result
        if (obj.isSorted(a, n)) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is NOT sorted");
        }
    }
}
