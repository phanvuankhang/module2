package ss19_string_regex.bai_tap;

import java.util.Scanner;

public class ValidateName {
    public static final String NAME="^\\p{Lu}\\p{Ll}*(\\s\\p{Lu}\\p{Ll}*)*$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ tên.");
        String nameClass = scanner.nextLine();
        boolean check = nameClass.matches(NAME);
        if (check) {
            System.out.println("Tên hợp lệ.");
        } else {
            System.out.println("Tên không hợp lệ.");
        }
    }
}
