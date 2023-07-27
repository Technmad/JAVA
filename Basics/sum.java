
import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number 1 & 2 :");
            int num1= input.nextInt();
            int num2= input.nextInt();
            int sum = num1 + num2;
            System.out.println("com.FP.sum =" + sum);
        }

    }
}
