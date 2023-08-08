package method;

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = sc.nextInt();
        System.out.println("Enter the number");
        int num2 = sc.nextInt();
        int add = add(num1, num2);
        System.out.println("The sum of two numbers : " + add);
    }

    static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
