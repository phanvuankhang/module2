package ss6_inheritance.bai_tap.circle_and_cylinder;

public class Circle {
    protected double radius;
    protected String coler;

    public Circle() {
    }

    public Circle(double radius, String coler) {
        this.radius = radius;
        this.coler = coler;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColer() {
        return coler;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", coler='" + coler + '\'' +
                '}';
    }
}
