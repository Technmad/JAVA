package cs;

import java.util.Scanner;

public class vowelsConst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String wrd = sc.nextLine();
        char p = wrd.charAt(0);
        if (p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
