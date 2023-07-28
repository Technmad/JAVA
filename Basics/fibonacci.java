

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n for com.FP.fibonacci series ");
            int n= sc.nextInt();
            int t1= 0;
            int t2= 1;
            for (int i=1; i<=n; i++){
                System.out.print(t1 +",");
                int t3 = t1 + t2;
                t1 = t2;
                t2 = t3;

            }
        }
    }
}
