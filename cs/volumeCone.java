package cs;

import java.util.Scanner;

public class volumeCone {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double radius,height,volume;
        System.out.println("Enter the radius");
        radius= sc.nextDouble();
        System.out.println("Enter the height");
        height= sc.nextDouble();
        volume= 3.14*radius*radius*height/3;
        System.out.println("Volume is "+ volume);
    }
}
