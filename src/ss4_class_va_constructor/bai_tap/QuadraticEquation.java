package ss4_class_va_constructor.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getRoot1() {
        double root1;
        root1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        return root1;
    }

    public double getRoot2() {
        double root1;
        root1 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        return root1;
    }

    public int getDiscriminant() {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            return 1;
        }
        if (delta == 0) {
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = sc.nextDouble();
        System.out.println("Enter b:");
        double b = sc.nextDouble();
        System.out.println("Enter c:");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Root 1 of quadratic equation is: " + quadraticEquation.getRoot1());
            System.out.println("Root 2 of quadratic equation is: " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Root of quadratic equation is: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }
    }
}
