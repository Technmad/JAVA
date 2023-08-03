package cs;

import java.util.Scanner;

public class sumIInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=0; int sum=num;
        System.out.println("Enter the number");
        num= sc.nextInt();
        while (num!=0){
            System.out.println("Enter the number");
            int input= sc.nextInt();
            if(input==0){ break; }
            else { sum += input;
                num=input;

            }
        }
        System.out.println("sum is "+ sum);

    }
}
