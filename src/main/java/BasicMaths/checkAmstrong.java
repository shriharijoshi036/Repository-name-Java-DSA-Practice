import java.util.Scanner;

public class checkAmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int n = sc.nextInt();
        int dup = n;
        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;          // get last digit
            sum = sum + (lastDigit*lastDigit*lastDigit); // build reverse
            n = n / 10;                     // remove last digit
        }if(dup == sum){
            System.out.println("the number is an Amstrong");
        }else{
            System.out.println("the number is not Amstrong number");
        }

    }
}
