package Misc;
import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int upperCase=0;
        int lowerCase=0;
        String word= sc.nextLine();
        char[] ch=word.toCharArray();
        for(char t: ch){
            if(t >= 'A' && t<='Z'){
                upperCase++;
            } else if (t >= 'a' && t<='z') {
               lowerCase++;
            }
        }

        if(upperCase>lowerCase){
            System.out.println(word.toUpperCase());
        }else{
            System.out.println(word.toLowerCase());
        }
    }
}
