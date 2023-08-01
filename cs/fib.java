package cs;

import java.util.Scanner;

public class fib {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n for fibonacci series");
        int n= sc.nextInt();
        int term1 =0;
        int term2 =1;
        int term3;
        for(int i=0; i<n; i++){
            System.out.print(term1 +" ");
            term3 = term1 + term2;
            term1 = term2;
            term2= term3;

        }
    }
}
