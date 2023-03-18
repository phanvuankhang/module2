package ss7_abstract_class_and_interface.bai_tap.colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Square();
        for (Shape s : shape) {
            System.out.println("\n"+s);
            if (s instanceof Colorable) {
                ((Colorable) s).howToColor();
            }
        }
    }
}
