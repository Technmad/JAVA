package cs;

import java.util.Scanner;

public class investment {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the inital amount");
        double initial= sc.nextDouble();
        System.out.println("Enter the rate of return");
        double rate= sc.nextDouble();
        System.out.println("Enter the time period");
        double time= sc.nextDouble();
        double futureValue= initial*Math.pow((1+rate/100),time);
        System.out.println("Future Vale of Investment is " + futureValue);
    }
}
