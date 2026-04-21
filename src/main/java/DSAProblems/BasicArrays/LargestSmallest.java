package DSAProblems.BasicArrays;

import java.util.Scanner;

public class LargestSmallest {
    public int secondLargest(int a [],int n){
        int largest = a[0];
        int slargest = -1;
        for(int i =1;i<n;i++){
            if(a[i]>largest){
                slargest = largest;
                largest = a[i];
            } else if (a[i]< largest && a[i]>slargest) {
                slargest = a[i];

            }
        }
        return slargest;

    }
    public int secondSmallest(int a [], int n){
        int smallest = a[0];
        int ssmallest = Integer.MAX_VALUE;
        for(int i = 1;i<n;i++){
            if(a[i]<smallest){
                ssmallest = smallest;
                smallest = a[i];
            } else if (a[i] > smallest && a[i] < ssmallest) {
                ssmallest = a[i];
                
            }
        }
        return ssmallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int a [] = new int[n];

        System.out.printf(" enter " + n + "elements");
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        LargestSmallest ls = new LargestSmallest();
        System.out.println("Second Largest: " + ls.secondLargest(a, n));
        System.out.println("Second Smallest: " + ls.secondSmallest(a, n));



    }
}
