package method;

import java.util.Scanner;

/*
  Java Program to Check if a Given Integer is Odd or Even
 */
public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        evenOdd(num);

    }

    private static void evenOdd(int num) {

        if (num % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

    }
}
