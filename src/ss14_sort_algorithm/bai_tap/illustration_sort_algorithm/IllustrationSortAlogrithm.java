package ss14_sort_algorithm.bai_tap.illustration_sort_algorithm;

import java.util.Arrays;

public class IllustrationSortAlogrithm {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 7, -3, 8, 2, 9};
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int pos = i;
            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
            System.out.println(Arrays.toString(arr));
        }
    }
}
