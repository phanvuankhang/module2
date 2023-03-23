package ss15_exception_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    static Scanner scanner = new Scanner(System.in);
    static int i = 1;

    public static void main(String[] args) {
        int a, b, c;
        while (true) {
            a = inputTriangleSide();
            b = inputTriangleSide();
            c = inputTriangleSide();
            try {
                check3TriangleSide(a, b, c);
                System.out.println("Đây là tam giác.");
                break;
            } catch (IllegalTriangleException e) {
                i = 1;
                System.out.println("Đây không phải là tam giác.");
                System.out.println();
            }
        }
    }

    static int inputTriangleSide() {
        int side;
        while (true) {
            System.out.println("Nhập cạnh thứ " + i + ": ");
            try {
                side = Integer.parseInt(scanner.nextLine());
                checkTriangleSide(side);
                i++;
                System.out.println();
                return side;
            } catch (IllegalTriangleException e) {
                System.out.println("Cạnh tam giác phải lớn hơn 0.");
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println("Cạnh tam giác phải là số nguyên.");
                System.out.println();
            }
        }
    }

    static void check3TriangleSide(int a, int b, int c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || c + b <= a) {
            throw new IllegalTriangleException("Tổng 2 cạnh không lớn hơn cạnh còn lại.");
        }
    }

    static void checkTriangleSide(int a) throws IllegalTriangleException {
        if (a <= 0) {
            throw new IllegalTriangleException("Giá trị nhập vào là số âm.");
        }
    }
}
