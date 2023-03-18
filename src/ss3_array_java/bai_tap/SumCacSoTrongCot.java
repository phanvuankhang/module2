package ss3_array_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumCacSoTrongCot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng");
        int soDong = sc.nextInt();
        System.out.println("Nhập vào số cột của mảng");
        int soCot = sc.nextInt();
        int[][] arr = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.println("Nhập vào phần tử thứ" + i + "-" + j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Nhập cột cần tính tổng: ");
        int index = sc.nextInt();
        sum(arr, index);
    }

    public static void sum(int arr[][], int index) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (index == j) {
                    sum += arr[i][index];
                }
            }
        }
        System.out.println("Tổng của cột " + index + " trong mảng là: " + sum);
    }
}
