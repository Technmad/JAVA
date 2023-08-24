package Misc;

import java.util.Scanner;

public class p17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int r=sc.nextInt();
        int count=0;

        for(int i=1; i<10 ; i++){

            if( k*i%10==0 || k*i%10==r){
                count = i;
                break;
            }
        }
        System.out.println(count);

    }
}
