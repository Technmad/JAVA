package method;

import java.util.Scanner;

public class circle {
    double radius = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = sc.nextDouble();
        double Circumference = getCircum(radius);
        double Area = getArea(radius);
        System.out.printf("Circumference of circle with radius %f is %f %n", radius, Circumference);
        System.out.printf("Area of circle with radius %f is %f \n", radius, Area);
        circle c1 = new circle();
        System.out.println(c1.radius);
    }

    static double getArea(double radius) {
        double area = 3.14 * radius * radius;
        return area;
    }

    static double getCircum(double radius) {
        double curcumf = 2 * 3.14 * radius;
        return curcumf;
    }

}
