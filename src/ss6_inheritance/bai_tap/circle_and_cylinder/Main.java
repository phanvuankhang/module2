package ss6_inheritance.bai_tap.circle_and_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2, "red");
        Cylinder cylinder = new Cylinder(3, "blue", 4);
        System.out.println("Màu hình tròn là: " + circle.getColer());
        System.out.println("Bán kính hình tròn là: " + circle.getRadius());
        System.out.println("Diện tích hình tròn là: " + cylinder.getArea());
        System.out.println("Màu hình trụ là: " + cylinder.getColer());
        System.out.println("Bán kính hình trụ là: " + cylinder.getRadius());
        System.out.println("Chiều cao hình trụ là: " + cylinder.getHeight());
        System.out.println("Diện tích hình trụ là: " + cylinder.getVolume());
    }
}
