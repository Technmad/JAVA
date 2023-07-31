package cs;

import java.util.Scanner;

public class avgValue {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the total number ");
        double value=0;
        double num= sc.nextDouble();
        double sum=0;
        double avg;
        for (int i=1; i<=num; i++){
            System.out.println("Enter the value");
            value= sc.nextDouble();
            sum += value;
        }
        avg = sum/num;
        System.out.println("The average value is "+ avg );
    }
}
