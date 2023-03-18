package ss3_array_java.bai_tap;

import java.util.Scanner;

public class TimMinTrongMang {
    public static void main(String[] srgs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập SIZE của mảng");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        System.out.println("Nhập phần tử: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
