package ss1_introduction_in_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int vnd = 23000;
        int usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền USD.");
        usd = scanner.nextInt();
        int quyDoi = usd * vnd;
        System.out.println("Số tiền VNĐ là: " + quyDoi);
    }
}
