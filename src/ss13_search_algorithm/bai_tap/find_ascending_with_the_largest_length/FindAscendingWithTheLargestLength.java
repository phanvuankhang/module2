package ss13_search_algorithm.bai_tap.find_ascending_with_the_largest_length;

import java.util.LinkedList;
import java.util.Scanner;

public class FindAscendingWithTheLargestLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi kí tự: ");
        String str = scanner.nextLine();
        LinkedList<Character> maxList = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }
            if (list.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(list);
            }
        }
        System.out.print("Chuỗi kí tự con được sắp xếp theo thứ tự từ bé đến lớn là: ");
        for (Character character : maxList) {
            System.out.print(character);
        }
    }
}
