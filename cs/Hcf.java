package cs;

import java.util.Scanner;
class Hcf {
    public static void main(String arg[]) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  first number");
        n1 = sc.nextInt();
        System.out.println("Enter second number");
        n2 = sc.nextInt();

        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;

            }

        }
        int hcf=Math.min(n1,n2);
        System.out.println("Hcf of two numbers is=" + hcf);
    }
}
