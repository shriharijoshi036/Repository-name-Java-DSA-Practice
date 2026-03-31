package BasicMaths;

import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kindly enter the number");
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            int Lastdigit = n % 10;
            count++;
            System.out.println(Lastdigit);
            n = n / 10;

        }
        System.out.println("Total digits : " + count);

    }
}