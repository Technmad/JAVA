package cs;

import java.util.Scanner;

public class discount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Totalcost");
        double totalCost=sc.nextDouble();
        double costToPay=0;
        double Discount;
        if(totalCost<=800){
            costToPay=totalCost;
        } else if (totalCost>800 && totalCost<=1500) {
            Discount= totalCost*0.1;
            costToPay= totalCost- Discount;
        } else if (totalCost>1500 && totalCost<= 2500) {
            Discount =totalCost*0.15;
            costToPay= totalCost-Discount;
        } else if (totalCost>2500){
            Discount= totalCost*.20;
            costToPay=totalCost-Discount;
        }

        System.out.println("Total cost after discount is "+ costToPay);
    }
}
