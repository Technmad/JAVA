package Misc;

import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int sumS=0;
        int sumD=0;
        int q=num-1;
        int p=0;
        while (p<q && q>0 && p<num){
            if(arr[p] > arr[q]){
                sumS += arr[p];
                p++;
            }else{
                sumS += arr[q];
                q--;
            }if(arr[p] > arr[q]){
                sumD += arr[p];
                p++;
            }else{
                sumD += arr[q];
                q--;
            }
        }
        if(num%2!=0){
            sumS += arr[p];
        }
        System.out.println(sumS +" "+sumD);
    }
}