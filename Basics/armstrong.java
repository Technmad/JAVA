
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the three digit number to check for Armstrong");
            int num = sc.nextInt();
            int number, temp, total = 0;
            number = num;

            while (number != 0) {
                temp = number % 10;
                total = total + temp * temp * temp;
                number = number / 10;
            }
            if (total == num) {
                System.out.println(num + " is a com.FP.armstrong number");
            } else {
                System.out.println(num + " is not a com.FP.armstrong number");
            }
        }
    }
}
