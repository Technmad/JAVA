package cs;

import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the base of triangle");
            double base= sc.nextDouble();
            System.out.println("Enter the height of triangle");
            double height= sc.nextDouble();
            double area= base*height/2;
            System.out.println("Area of triangle is "+ area);
        }
    }
}
