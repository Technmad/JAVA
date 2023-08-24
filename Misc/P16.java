package Misc;

import java.util.Scanner;

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] data = new int[n][2];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                data[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; j++) {
                if (data[i][0] == data[j][1]) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
