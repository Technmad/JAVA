package cs;

import java.util.Scanner;

public class javaReversal {
    public  static void main(String[]  args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String input= sc.nextLine();
        String temp="";
        int l= input.length();
        for(int i=l-1; i>=0; i--){
          temp= temp+ input.charAt(i);
        }
        System.out.println("reversed string is "+ temp);
    }
}
