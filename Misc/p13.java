package Misc;

import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int crime=0;
        int pol=0;
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i < num; i++){
            if(arr[i] == -1){

                if (pol>0){
                    pol = pol-1;
                } else {
                    crime ++;
                }

            } else {
                pol = pol + arr[i];
            }
        }
        System.out.println(crime);

    }
}