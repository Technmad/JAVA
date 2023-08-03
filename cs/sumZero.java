package cs;

import java.util.Scanner;

public class sumZero {
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for addition till zero");
        int num,sum=0;
        do{
            num= sc.nextInt();
            sum += num;
        }while (num!=0);
        System.out.println("sum is equal to "+ sum );
    }
}
