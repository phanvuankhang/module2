package ss5_access_modifier_static.bai_tap.access_modifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính");
        double radius = sc.nextDouble();
        Circle c1 = new Circle(radius);
        System.out.println("Diện tích hình tròn là : " + c1.getArea());
    }
}
