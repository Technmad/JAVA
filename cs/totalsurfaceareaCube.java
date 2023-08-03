package cs;

import java.util.Scanner;

public class totalsurfaceareaCube {
    public static void main(String[]  args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the side");
        double r= sc.nextDouble();
        double pi=3.14;
        double area= 6*r*r;
        System.out.println("The total surface area of cube is " + area);
    }
}
