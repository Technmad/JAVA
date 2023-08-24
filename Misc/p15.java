package Misc;

import java.util.Scanner;
import java.lang.Math;


    public class p15 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int count =0;

            int num= Math.abs(s.charAt(0)-'a');

            count = Math.min( num, 26-num);

            for (int i=0; i< s.length()-1; i++){
                num = Math.abs( s.charAt(i) - s.charAt(i+1));
                count += Math.min( num, 26-num);

            }
            System.out.println(count);
        }
    }

