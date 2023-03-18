package ss7_abstract_class_and_interface.bai_tap.colorable;

public class Rectangle extends Shape implements Colorable {
    private double width = 1.0;
    private double length = 2.0;


    public void Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "\n Diện tích hình chữ nhật:  "
                + getArea();

    }

    @Override
    public void howToColor() {

    }
}
