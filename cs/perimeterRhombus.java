package cs;

import java.util.Scanner;

public class perimeterRhombus {
    public static void main(String[] args){
        double side,perimeter;
        System.out.println("Enter the side");
        Scanner sc=new Scanner(System.in);
        side= sc.nextDouble();
        perimeter=4*side;
        System.out.println("Perimeter is "+ perimeter);
    }
}
