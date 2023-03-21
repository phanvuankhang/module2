package ss13_search_algorithm.bai_tap.set_up_binary_search_use_recursion;

import java.util.Arrays;
import java.util.Scanner;

import static ss13_search_algorithm.bai_tap.set_up_binary_search_use_recursion.BinarySearch.sort;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích cỡ của mảng: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + " của mảng:");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng đã nhập là: ");
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập phần tử cần tìm: ");
        int number = Integer.parseInt(scanner.nextLine());
        int value = BinarySearch.binarySearch(arr, number, 0, arr.length - 1);
        if (value != -1) {
            System.out.println("Vị trí của " + number + " là: " + value);
        } else {
            System.out.println("Phần tử không tồn tại.");
        }
    }
}
