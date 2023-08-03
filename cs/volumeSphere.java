package cs;

import java.util.Scanner;

public class volumeSphere {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double radius,volume;
        System.out.println("Enter the radius");
        radius= sc.nextDouble();
        volume= 3.14*4*radius*radius*radius/3;
        System.out.println("Volume is "+ volume);
    }
}
