package ss3_array_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập vào các phần tử mảng");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập phần tử cần chèn");
        int add = scanner.nextInt();
        System.out.println("Nhập vào vị trí cần chèn");
        int index = scanner.nextInt();
        if (index <= -1 || index >= arr.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (index == i) {
                    for (int j = arr.length - 1; j > i; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[index] = add;
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
