package method;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = sc.nextInt();
        System.out.println("Enter the number");
        int num2 = sc.nextInt();
        int product = getProduct(num1, num2);
        System.out.printf("The product of %d and %d is %d ", num1, num2, product);

    }

    static int getProduct(int num1, int num2) {
        int prd = num1 * num2;
        return prd;
    }
}
