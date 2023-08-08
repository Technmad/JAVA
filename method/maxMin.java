package method;

/*
   Java Program to find largest and smallest of three numbers
 */
import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number");
        int num3 = sc.nextInt();
        int largest = largest(num1, num2, num3);
        int smallest = smallest(num1, num2, num3);
        System.out.printf("Largest of three number %d, %d and %d is : %d %n ", num1, num2, num3, largest);
        System.out.printf("Smallest of three number %d, %d and %d is : %d %n ", num1, num2, num3, smallest);
    }

    private static int largest(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > num1) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    private static int smallest(int num1, int num2, int num3) {
        int min = num1;
        if (num2 < num1) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }
}