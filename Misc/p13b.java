package Misc;

import java.util.Scanner;

public class p13b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int crime = 0;
        int pol = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            if (arr[i] > 0) {
                pol = arr[i];
            } else if (arr[i] == -1 && pol == 0) {
                crime++;
            } else if (arr[i] == -1 && pol != 0) {
                pol--;
            }
        }
        System.out.println(crime);
    }
}
