package BasicArrays;

import java.util.Scanner;

public class launchArr3 {
    public static void main(String[] args) {
        int marks[][][] = new int[2][3][4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                for (int k = 0; k < marks[i][j].length; k++) {
                    System.out.println("kindly enter the marks of school" + i + " of class" + j + " of student" + k);
                    marks[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("marks stored in an array");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                for (int k = 0; k < marks[i][j].length; k++) {
                    System.out.print(marks[i][j][k] + " ");
                }
                System.out.println();
            }

        }

    }
}
