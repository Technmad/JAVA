

import java.util.Scanner;

public class even {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to find Even or Odd");
            int num= sc.nextInt();
            if( num%2 == 0){
                System.out.println("Number is Even");
            } else {
                System.out.println("Number is Odd");
            }
        }

    }
}
