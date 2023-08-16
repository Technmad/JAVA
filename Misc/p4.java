package Misc;

import java.util.Arrays;
import java.util.Scanner;

public class p4 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int nofclm = sc.nextInt();
        int[] arr = new int[nofclm];
        for (int i = 0; i != nofclm; ++i)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        for (int j = 0; j != nofclm; ++j) {
            System.out.print(arr[j]);
            System.out.print(" ");
        }
    }
}
