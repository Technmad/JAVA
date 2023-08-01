package cs;

import java.util.Scanner;

public class maxium {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        while(num!=0){
            System.out.println("Enter the number");
            int input= sc.nextInt();
            if(input==0){ break; }
            if (input>num){
               num= input;
            }
        }
        System.out.println("The maximum of numbers are " + num);
    }
}
