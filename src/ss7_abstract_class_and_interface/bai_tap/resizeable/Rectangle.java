package ss7_abstract_class_and_interface.bai_tap.resizeable;

public class Rectangle extends Shape implements Resizeable{
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
        return "Chiều rộng hình chữ nhật: "
                + getWidth()
                + "\n Chiều dài hình chữ nhật: "
                + getLength()
                + "\n Diện tích:  "
                + getArea()
                + "\n Chu vi: "
                + getPerimeter();

    }

    public void resize(double percent) {
        setLength(getLength() * percent / 100 + getLength());
        setWidth(getWidth() * percent / 100 + getWidth());
    }
}
