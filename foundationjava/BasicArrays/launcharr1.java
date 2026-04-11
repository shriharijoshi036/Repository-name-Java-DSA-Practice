package BasicArrays;

import java.util.Scanner;

class launcharr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks [] = new int[5];
        for(int i = 0;i<5;i++){
            System.out.println("please enter the marks of student " + i);
            marks[i] = sc.nextInt();
        }
        for(int i = 0; i <5; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
