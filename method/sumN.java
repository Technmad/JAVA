package method;

import java.util.Scanner;

public class sumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to add");
        int count = sc.nextInt();
        int sum = getSum(count);
        System.out.printf("Sum of %d numbers is %d ", count, sum);
    }

    static int getSum(int count) {
        Scanner sc = new Scanner(System.in);
        int add = 0;
        int input;
        for (int i = 1; i <= count; i++) {
            System.out.println("Enter the value");
            input = sc.nextInt();
            add += input;
        }
        return add;
    }
}
