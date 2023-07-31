package cs;

import java.util.Scanner;

public class distBWpoints {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cordinates of point");
        double X1=sc.nextDouble();
        double Y1= sc.nextDouble();
        double X2= sc.nextDouble();
        double Y2= sc.nextDouble();
       double distance=  Math.sqrt(Math.pow(X2-X1, 2) + Math.pow(Y2-Y1, 2));
        System.out.println("Distance between points are "+ distance);
        }
    }

