package Misc;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == b && a == 1 || b == c && b == 1 || a == c && c == 1) {

                count++;
            }

        }
        System.out.println(count);
    }
}
