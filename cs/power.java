package cs;

import java.util.Scanner;

public class power {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number for finding power");
        double num1= sc.nextDouble();
        double num2= sc.nextDouble();
        double power= Math.pow(num1,num2);
        System.out.println(num2 + " raised to "+ num1 +" is equal to " + power);
    }
}
