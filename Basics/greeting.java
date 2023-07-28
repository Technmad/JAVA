
import java.util.Scanner;

public class greeting {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name");
            String gr= sc.nextLine();
            System.out.println("Happy Birthday "+ gr);
        }
    }
}
