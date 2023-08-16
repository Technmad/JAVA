package Misc;

import java.util.Arrays;
import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        char[] ch=s1.toCharArray();
        Arrays.sort(ch);
        int num=1;
        for(int i=1; i<s1.length(); ++i){
            if(ch[i-1]!=ch[i]){
                ++num;
            }
        }
        if(num%2==0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
