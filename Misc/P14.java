package Misc;

import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        System.out.println("Enter String");
        String s = sc.next();

        int count =0;

        for (int i=0; i< s.length(); i++){
            switch (s.charAt(i)) {
                case '1' :
                    count+=num1;
                    break;
                case '2' :
                    count+= num2;
                    break;
                case '3' :
                    count+= num3;
                    break;
                case '4' :
                    count+= num4;
                    break;
            }

        }
        System.out.println(count);
    }
}

