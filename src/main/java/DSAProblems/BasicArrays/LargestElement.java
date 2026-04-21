package DSAProblems.BasicArrays;

import java.util.Scanner;

public class LargestElement {
     public static void findingLargest(int arr[]){
         int Largest = arr[0];
         for(int i=1;i< arr.length;i++){
             if(arr[i]>Largest){
                 Largest = arr[i];
             }
         }
         System.out.print("largest element is : " +Largest);
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findingLargest(arr);

    }
}
