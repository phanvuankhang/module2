package ss4_class_va_constructor.bai_tap;

public class Fan {
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    int speed;
    boolean on;
    double radius = 5;
    String color = "blue";

    public Fan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public String toString() {
        if (isOn()) {

            return "speed: " + this.speed + " ,radius: " + this.radius + " ,color: " + this.color + " ,fan is on";

        } else {
            return "color: " + this.color + " ,radius: " + this.radius + " ,fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(FAST, 10, "yellow", true);
        Fan fan2 = new Fan(MEDIUM, 5, "blue", false);
        System.out.println("fan1: " + fan1);
        System.out.println("fan2: " + fan2);
    }
}
