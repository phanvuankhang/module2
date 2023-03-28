package ss19_string_regex.bai_tap;

import java.util.Scanner;

public class ValidateClass {
    public static final String NAME_CLASS = "^[CAP]\\d{4}[GHIK]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp");
        String nameClass = scanner.nextLine();
        boolean check = nameClass.matches(NAME_CLASS);
        if (check) {
            System.out.println("Tên lớp hợp lệ.");
        } else {
            System.out.println("Tên lớp không hợp lệ.");
        }
    }
}
