package cs;

import java.util.Scanner;

public class electricityBill {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the unit consumed");
        double unit = sc.nextDouble();
        double bill=0;
        if (unit<=100){
            bill= unit*10;
        } else if (unit<=200) {
            bill = 100*10 + (unit-100)*15;
        } else if (unit<=300){
            bill = 100*10+100*15+(unit-200)*20;
        }
        System.out.println("Your electricity bill is Rs "+ bill);
        }
    }
