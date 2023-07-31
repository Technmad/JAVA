package cs;

import java.util.Scanner;

public class areaRhombus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double d1, d2, area;
        System.out.println("Enter the diagonal 1");
        d1= sc.nextDouble();
        System.out.println("Enter the diagonal 2");
        d2= sc.nextDouble();
        area = d1*d2/2;
        System.out.println("Area of Rhombus is "+ area);


    }
}
