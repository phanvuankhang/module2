package ss19_string_regex.bai_tap;

import java.util.Scanner;

public class ValidateNumberPhone {
    public static final String NUMBER_PHONE = "^[(][0-9]{2}[)]-[(][0][0-9]{9}[)]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sô điện thoại");
        String nameClass = scanner.nextLine();
        boolean check = nameClass.matches(NUMBER_PHONE);
        if (check) {
            System.out.println("Số điện thoại hợp lệ.");
        } else {
            System.out.println("Số điện thoại không hợp lệ.");
        }
    }
}
