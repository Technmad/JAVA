package cs;

import java.util.Scanner;

public class depreciation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter initial amount:");

        double amount=sc.nextDouble();

        System.out.print("Enter depericationRate:");

        double depreciationRate =sc.nextDouble();

        double depreciation=( depreciationRate/100)*amount;

        System.out.println("depreciation amount="+depreciation);
    }
}
