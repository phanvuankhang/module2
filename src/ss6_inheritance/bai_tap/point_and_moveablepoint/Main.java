package ss6_inheritance.bai_tap.point_and_moveablepoint;

public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        MoveablePoint m = new MoveablePoint();
        m.setXY(1, 2);
        m.setSpeed(3, 4);
        System.out.println(p);
        System.out.println(m);
        System.out.println(m.move());
    }
}
