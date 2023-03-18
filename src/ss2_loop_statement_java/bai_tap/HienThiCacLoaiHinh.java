package ss2_loop_statement_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n 1.Print the rectangle" +
                    "\n 2.Print the square triangle(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)" +
                    "\n 3.Print isosceles triangle" +
                    "\n 4.Exit");
            System.out.println("Chọn hình muốn vẽ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("2.Print the square triangle(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("3.Print isosceles triangle");
                    for (int i = 1; i <= 5; i++) {
                        for (int x = 5; x > i; x--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i * 2 - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                default:
                    System.out.println("4.Ẽit");
                    flag = false;
            }
        } while (flag);
    }
}
