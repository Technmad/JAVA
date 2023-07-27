
import java.util.Scanner;

public class inrusd {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the amount INR");
            double inr= sc.nextDouble();
            double usd=inr/80;
            System.out.println("amount in USD = " + usd);
        }
    }
}
