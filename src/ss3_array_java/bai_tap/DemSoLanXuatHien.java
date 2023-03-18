package ss3_array_java.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập vào một chuỗi bất kỳ");
    String str = sc.nextLine();
    System.out.println("Chuỗi vừa nhập là: " + str);
    System.out.println("Nhập một ký tự");
    countChar(str);
}

    public static void countChar(String str) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + c + " trong chuỗi là: " + count);
    }
}
