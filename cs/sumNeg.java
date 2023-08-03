package cs;

import java.util.Scanner;

public class sumNeg {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int nSum=0;
        int eSum=0;
        int oSum=0;
        while(true){
            System.out.println("Enter the numbers");
            int num= sc.nextInt();
            if(num==0){
                break;
            }
            if (num<0) {
                nSum +=num;

            } else if (num%2==0) {
                eSum +=num;

            } else {
                oSum +=num;
            }
        }
        System.out.println("The sum of negative numbers: "+nSum);
        System.out.println("The sum of even numers: "+eSum);
        System.out.println("The sum of odd numbers "+ oSum);
    }
}
