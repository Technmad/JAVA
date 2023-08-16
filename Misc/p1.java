//package Misc;

import java.util.Scanner;

public class p1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int sum=0;
        int[] arr=new int[n];

        for(int i=0; i<n; ++i){
            arr[i]=sc.nextInt();
            if(arr[i]>h){
                sum = sum+2;
            }else{
                sum=sum+1;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
