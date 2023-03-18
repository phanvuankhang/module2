package ss3_array_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumDuongCheoChinhMaTranHinhVuong {
    public static void main(String[] args) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào số dòng của mảng");
            int soDong = sc.nextInt();
            System.out.println("Nhập vào số cột của mảng");
            int soCot = sc.nextInt();
            if (soCot != soDong) {
                System.out.println("Không phải là ma trận hình vuônng. Mời bạn nhập lại.");
            } else {
                int[][] arr = new int[soDong][soCot];
                for (int i = 0; i < soDong; i++) {
                    for (int j = 0; j < soCot; j++) {
                        System.out.println("Nhập vào phần tử thứ" + i + "-" + j);
                        arr[i][j] = sc.nextInt();
                    }
                }
                System.out.println(Arrays.deepToString(arr));
                sum(arr);
            }
        } while (true);
    }

    public static void sum(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][i];
                }
            }
        }
        System.out.println("Tổng các số ở đường chéo chính của ma trận vuông là: " + sum);
    }
}
