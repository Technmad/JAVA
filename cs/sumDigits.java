package cs;

import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
           int temp=num%10;
            sum +=temp;
            num=num/10;
        }
        System.out.println("the sum of digits are "+ sum);
    }
}
