package cs;

import java.util.Scanner;

public class battingAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of innings ");
        double value = 0;
        double num = sc.nextDouble();
        System.out.println("NUmber of inning with notout");
        double no= sc.nextDouble();
        double sum = 0;
        double avg;
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter the score");
            value = sc.nextDouble();
            sum += value;
        }
        avg = sum / (num-no);
        System.out.println("The batting average is " + avg);
    }
}
