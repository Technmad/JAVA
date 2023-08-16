package Misc;
import java.util.Arrays;
import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine();
        int check=1;
        for(int i=0; i<s1.length(); ++i){
            for(int j=0; j<s1.length(); ++j) {
                if (s1.charAt(i)==s1.charAt(j) && i != j ) {
                    ++check;
                }
            }
        }
       int type=s1.length() - check/2;
        if(type%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
