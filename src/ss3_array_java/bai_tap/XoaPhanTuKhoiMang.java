package ss3_array_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập vào các phần tử mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập phần tử cần xóa");
        int delete = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (delete == arr[i]) {
                System.out.println(i);
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                arr[arr.length - 1] = 0;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
