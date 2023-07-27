
import java.util.*;
public class palin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a word");
            String wrd, temp = "";
            wrd = sc.nextLine();
            int l = wrd.length();
            for (int i = l - 1; i >= 0; i--) {
                temp = temp + wrd.charAt(i);
            }
            if (wrd.equalsIgnoreCase(temp)) {
                System.out.println("The string is palindrome ");
            } else {
                System.out.println("The string is not palindrome");
            }
        }
    }
}