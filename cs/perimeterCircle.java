package cs;

import java.util.Scanner;

public class perimeterCircle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double r,perimeter;
        System.out.println("Enter the radius");
        r= sc.nextDouble();
        perimeter= 2*3.14*r;
        System.out.println("Perimeter is "+ perimeter);
    }
}
