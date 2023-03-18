package ss7_abstract_class_and_interface.bai_tap.colorable;

public class Square extends Shape implements Colorable {
    private double side = 1.0;

    public Square() {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return getSide() * getSide();
    }

    public double getPerimeter() {
        return getSide() * 4;
    }

    @Override
    public String toString() {
        return "\n Diện tích hình vuông: "
                + getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("color all four sides");
    }
}
