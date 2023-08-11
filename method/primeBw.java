package method;

import java.util.Scanner;

public class primeBw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the smaller number ");
        int num1 = sc.nextInt();
        System.out.println("Enter the larger number ");
        int num2 = sc.nextInt();
        System.out.printf("The prime numbers between %d and %d are  ", num1, num2);
        checkPrime(num1, num2);

    }

    static void checkPrime(int num1, int num2) {

        for (int i = num1; i <= num2; ++i) {
            if (i == 0 || i == 1) {
                continue;
            }
            int check = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    check = 0;
                    break;
                }

            }

            if (check == 1) {
                System.out.println(i);
            }
        }

    }
}
