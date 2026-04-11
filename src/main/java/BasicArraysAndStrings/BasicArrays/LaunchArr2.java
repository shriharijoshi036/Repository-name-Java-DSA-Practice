package BasicArraysAndStrings.BasicArrays;

import java.util.Scanner;

public class LaunchArr2 {
    public static void main(String[] args) {
        int  marks [][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<marks.length;i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("kindly enter the marks of class" +i+  " of student"+j);
                marks[i][j] = sc.nextInt();
            }
        }
            System.out.println("marks stored in an array");
        for(int i = 0;i<marks.length;i++){
            for (int j =0;j<marks[i].length;j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
