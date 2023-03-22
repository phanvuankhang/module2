package ss14_sort_algorithm.bai_tap.setting_sort_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class SettingSortAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích cỡ mảng.");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào phần tử thứ: " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("Mảng đã nhập là: ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int pos = i;
            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
        System.out.println("Mảng đã sắp xếp là: " + Arrays.toString(arr));
    }
}

