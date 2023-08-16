package Misc;

import java.util.Scanner;
import java.util.Arrays;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clm = sc.nextInt();
        int[] arr = new int[clm];

        for (int i = 0; i < clm; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int j = 0; j < clm; j++) {
            System.out.print(arr[j] + " ");

        }
    }
}
