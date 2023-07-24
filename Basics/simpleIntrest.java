
import java.util.Scanner;

public class simpleIntrest {
    public static void main(String[] args){
        try (Scanner enter = new Scanner(System.in)) {
            System.out.println("calculate Simple interest");
            System.out.println("Enter Principle");
            int P= enter.nextInt();
            System.out.println("Enter time");
            int t= enter.nextInt();
            System.out.println("Enter rate");
            double r= enter.nextDouble();
            double simpleInterest=P*r*t/100;
            System.out.println("simple interest = " + simpleInterest);
        }


    }
}
