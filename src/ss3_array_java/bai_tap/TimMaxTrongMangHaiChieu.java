package ss3_array_java.bai_tap;

import java.util.Scanner;

public class TimMaxTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng");
        int soDong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng");
        int soCot = scanner.nextInt();
        int[][] arr = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.println("Nhập vào phần tử thứ" + i + "-" + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][i];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}
