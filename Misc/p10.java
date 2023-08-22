package Misc;

import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        String [] arr=new String[num];
        for ( int i =0; i < num; i++){
            arr[i]= sc.next();
        }
        int count =1;
        for (int i=0; i< num-1; i++){
            if (arr[i].equals(arr[i+1])){}
            else{
                count ++;
            }
        }
        System.out.println(count);

    }
}
