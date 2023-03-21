package ss13_search_algorithm.bai_tap.set_up_binary_search_use_recursion;

public class BinarySearch {
    public static int binarySearch(int[] array, int value, int left, int right) {
        int middle = (left + right) / 2;
        if (array[middle] == value) {
            return middle;
        } else if (value < array[middle]) {
            right = middle - 1;
        } else {
            left = middle + 1;
        }
        if (left <= right) {
            return binarySearch(array, value, left, right);
        }
        return -1;
    }

    static void sort(int[] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j;
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
