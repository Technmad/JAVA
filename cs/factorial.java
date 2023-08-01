package cs;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find its factorial");
        int num= sc.nextInt();
        int fac=1; int answer=0;
        for (int i=1; i<=num; i++){
            fac *= i;
            answer= fac;
        }
        System.out.println("factorial is "+ answer);
    }
}
