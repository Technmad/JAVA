import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the numbers");
            System.out.println("num1");
            double num1 = sc.nextDouble();
            System.out.println("num2");
            double num2 = sc.nextDouble();
            if (num1 > num2) {
                System.out.println("largest of two number is = " + num1);
            } else {
                System.out.println("largest of two number is = " + num2);
            }
        }
    }
}
