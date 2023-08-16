package Misc;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = new String[n];
        int a = 0;
        int d = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            if (s[i].equalsIgnoreCase("A")) {
                a++;
            } else {
                d++;
            }
        }
        if (a > d) {

            System.out.println("Anton");
        } else if (a == d) {
            System.out.println("Friendship");
        } else {
            System.out.println("Danik");
        }
    }
}
