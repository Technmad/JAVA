package cs;

import java.util.Scanner;

public class areaofcircle {
    public static void main(String[]  args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius");
        double r= sc.nextDouble();
        double pi=3.14;
        double area= pi*r*r;
        System.out.println("The area of circle is " + area);
    }
}
