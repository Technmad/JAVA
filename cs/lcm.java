package cs;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n1= sc.nextInt();
        System.out.println("Enter the number");
        int n2= sc.nextInt();
        int lcm=Math.max(n1,n2);

        while (true){
            if(lcm%n1==0 && lcm%n2==0){
                System.out.printf("the lcm of %d and %d is %d", n1,n2,lcm);
                break;
            }
            ++lcm;
        }

    }
}
