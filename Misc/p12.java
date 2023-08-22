package Misc;

import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = sc.next();

        int count =0;
        for (int i=0; i< num-1; i++){
            if ( s.charAt(i) == s.charAt(i+1)){
                count ++;
            }
        }
        System.out.println(count);
    }
}
