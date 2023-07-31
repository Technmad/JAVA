package cs;

import java.util.Scanner;

public class areaparllelogram {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double base, height, area;
        System.out.println("Enter the base of //gm");
        base= sc.nextDouble();
        System.out.println("Enter the height of //gm");
        height = sc.nextDouble();
        area = base*height;
        System.out.println("Area of //gm is "+ area);

    }
}
