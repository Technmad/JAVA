package method;

import java.util.Scanner;

public class pythagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st value");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd value");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd value");
        int c = sc.nextInt();
        Pythagorean(a, b, c);
    }

    static void Pythagorean(int a, int b, int c) {
        if (a * a + b * b == c * c ||
                a * a + c * c == b * b ||
                b * b + c * c == a * a)
            System.out.println("Pythagorean Triplets");
        else
            System.out.println("Not Pythagorean Triplets");
    }

}
