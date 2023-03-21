package ss13_search_algorithm.bai_tap.find_ascending_with_the_largest_length;

import java.util.Scanner;

public class FindAscendingWithTheLargestLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi kí tự: ");
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();
        int max = 0;
        System.out.println("Chuỗi kí tự sau khi sắp xếp: ");
        for (int i = 0; i < str.length(); i++) {
            if (max < charArray[i]) {
                max = charArray[i];
                System.out.print(charArray[i]);
            }
        }
    }
}
