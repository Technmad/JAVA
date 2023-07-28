

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the two number - ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            System.out.println("Enter the operation ( +,-,*,/ ) - ");
            char op = sc.next().charAt(0);

            Solve(num1, num2, op);
        }

    }

    public static void Solve(double num1, double num2, char op) {
        double ans = 0;
        if (op == '+') {
            ans = num1 + num2;
        } else if (op == '-') {
            ans = num1 - num2;
        } else if (op == '*') {
            ans = num1 * num2;
        } else {
            ans = num1 / num2;
        }
        System.out.println("Answer is = " + ans);
    }
}
