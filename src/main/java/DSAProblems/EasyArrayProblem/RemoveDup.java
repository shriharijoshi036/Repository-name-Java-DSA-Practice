package DSAProblems.EasyArrayProblem;

import java.util.Scanner;

public class RemoveDup {
    public int removeDuplicate(int a [],int n){
        if( n == 0){
            return 0;

        }
        int i =0;
            for(int j = i+1;j<n;j++){
                if(a[j] != a[i]){
                    a[i+1] = a[j];
                    i++;
                }
        }
            return i+1;
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
        RemoveDup rd = new RemoveDup();
        int newLength = rd.removeDuplicate(a, n);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(a[i] + " ");
        }


    }
}
