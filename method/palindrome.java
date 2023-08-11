package method;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String num = sc.nextLine();
        String getPalindrome = getPalindrome(num);
        // int num1=sc.nextInt();
        // checkPalindrome(num1);
        System.out.println("The number " + num + " is palindrome : " + getPalindrome);

    }

    static String getPalindrome(String num) {
        int len = num.length();
        String result = "";
        for (int i = 0; i < len / 2; ++i) {
            if (num.charAt(i) != num.charAt(len - i - 1)) {
                result = "NO";
            } else {
                result = "YES";
            }
        }
        return result;
    }

    /*
     * static boolean checkPalindrome(int num1)
     * {
     * int reverse = 0;
     * int temp = num1;
     * while (temp != 0) {
     * reverse = (reverse * 10) + (temp % 10);
     * temp = temp / 10;
     * }
     * return (reverse == num1);
     * }
     * 
     */
}