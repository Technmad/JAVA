package cs;

import java.util.Scanner;

public class volumePrism {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double length,height,volume, base;
        System.out.println("Enter the base");
        base= sc.nextDouble();
        System.out.println("Enter the height");
        height= sc.nextDouble();
        System.out.println("Enter the length");
        length= sc.nextDouble();
        volume= length*base*height/2;
        System.out.println("Volume is "+ volume);
    }
}
