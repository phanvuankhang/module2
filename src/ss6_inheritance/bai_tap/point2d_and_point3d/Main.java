package ss6_inheritance.bai_tap.point2d_and_point3d;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D coordinate1 = new Point2D();
        Point3D coordinate2 = new Point3D();
        System.out.println(coordinate1);
        System.out.println(coordinate2);
        coordinate2.setXYZ(2.0f, 3.0f, 4.0f);
        System.out.println("Point2D: " + Arrays.toString(coordinate2.getXY()));
        System.out.println("Point3D: " + Arrays.toString(coordinate2.getXYZ()));
    }
}
