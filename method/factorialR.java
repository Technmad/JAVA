package method;

import java.util.Scanner;

public class factorialR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial");
        int num = sc.nextInt();
        int factorial = getFact(num);
        System.out.println("Factorial of " + num + " is " + factorial);

    }

    static int getFact(int num) {
        if (num == 0) {
            return 1;
        } else {
            int temp = (num * getFact(num - 1));
            return temp;
        }
    }
}
