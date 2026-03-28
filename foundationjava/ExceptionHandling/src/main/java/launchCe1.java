import java.util.Scanner;
class UnderAgeException extends Exception{
    public UnderAgeException(String msg){
        super(msg);
    }
}
class OverAgeException extends Exception{
    public OverAgeException(String msg){
        super(msg);
    }
}

class Applicant {
    int age;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("kindly Enter your age");
        age = sc.nextInt();
    }
    public void verify() throws UnderAgeException , OverAgeException{
        if (age >= 18 && age <= 60 ){
            System.out.println("Proceed with License Application");
        } else if (age<18) {
            UnderAgeException uae = new UnderAgeException("Please be patience ! kiddo");
            System.out.println(uae.getMessage());
            throw uae;

        }else
        {
            OverAgeException oae = new OverAgeException("your time is to take rest at home");
            System.out.println(oae.getMessage());
            throw oae;
        }

    }
}
class RTO {
    public void initiate() {
        Applicant app = new Applicant();
        try {
            app.input();
            app.verify();
        } catch (UnderAgeException | OverAgeException e) {
            System.out.println("try again");
            try {
                app.input();
                app.verify();
            } catch (UnderAgeException | OverAgeException e1) {
                System.out.println("Your procees to be blocked");

            }
        }

    }
}
public class launchCe1 {
    public static void main(String[] args) {
        RTO rt = new RTO();
        rt.initiate();
    }

    }
