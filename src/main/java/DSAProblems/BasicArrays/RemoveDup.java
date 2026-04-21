package DSAProblems.BasicArrays;

import java.util.Scanner;

import java.util.Scanner;

public class RemoveDup {

    public int removeDuplicate(int a[], int n) {

        // 🔹 Edge case: if array is empty
        if (n == 0) {
            return 0;
        }

        // 🔹 i points to last unique element index
        int i = 0;

        /*
        🧠 DRY RUN EXAMPLE:
        Input: [1,1,2,2,3]

        Initial:
        i = 0 (points to first element = 1)
        j starts from 1
        */

        // 🔹 j scans the array
        for (int j = i + 1; j < n; j++) {

            /*
            🔁 Iteration 1:
            j = 1 → a[j] = 1, a[i] = 1
            1 == 1 → duplicate → skip
            i remains 0
            */

            /*
            🔁 Iteration 2:
            j = 2 → a[j] = 2, a[i] = 1
            2 != 1 → new unique element found
            */

            if (a[j] != a[i]) {

                /*
                Place this new element next to last unique element
                a[i+1] = a[j]
                */

                a[i + 1] = a[j];

                /*
                Array becomes:
                [1,2,2,2,3]
                */

                // move i forward
                i++;

                /*
                i = 1 now
                */
            }

            /*
            🔁 Iteration 3:
            j = 3 → a[j] = 2, a[i] = 2
            duplicate → skip
            */

            /*
            🔁 Iteration 4:
            j = 4 → a[j] = 3, a[i] = 2
            3 != 2 → unique
            */

            /*
            a[i+1] = a[j] → a[2] = 3
            Array becomes:
            [1,2,3,2,3]
            i = 2
            */
        }

        /*
        Final:
        Unique elements are from index 0 to i
        Total count = i + 1
        */

        return i + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter " + n + " elements (sorted):");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        RemoveDup rd = new RemoveDup();

        int newLength = rd.removeDuplicate(a, n);

        System.out.println("Array after removing duplicates:");

        // 🔹 print only unique elements
        for (int i = 0; i < newLength; i++) {
            System.out.print(a[i] + " ");
        }
    }
}