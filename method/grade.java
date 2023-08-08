package method;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks ");
        int marks = sc.nextInt();
        grade(marks);

    }

    static void grade(int marks) {
        if (marks > 90) {
            System.out.println("Your garde is AA");
        } else if (marks > 80) {
            System.out.println("Your grade is AB");
        } else if (marks > 70) {
            System.out.println("Your grade is BB");
        } else if (marks > 60) {
            System.out.println("Your grade is BC");
        } else if (marks > 50) {
            System.out.println("Your grade is CD");
        } else if (marks > 40) {
            System.out.println("Your grade is DD");
        } else {
            System.out.println("fail");

        }

    }
}
