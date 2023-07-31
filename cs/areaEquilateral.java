package cs;

import java.util.Scanner;

public class areaEquilateral {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double side, area;
        System.out.println("Enter the side");
        side=sc.nextDouble();
        area= 1.732*side*side/4;
        System.out.println("Area is "+ area);
    }
}
