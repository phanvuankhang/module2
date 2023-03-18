package ss7_abstract_class_and_interface.bai_tap.resizeable;

public class Square extends Shape implements Resizeable{
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
        return "Độ dài cạnh hình vuông: "
                + getSide()
                + "\n Chu vi: "
                + getPerimeter()
                + "\n Diện tích: "
                + getArea();
    }

    public void resize(double percent) {
        setSide(getSide() * percent / 100 + getSide());
    }
}
