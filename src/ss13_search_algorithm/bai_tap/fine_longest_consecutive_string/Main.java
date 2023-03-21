package ss13_search_algorithm.bai_tap.fine_longest_consecutive_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FineLongestConsecutiveString find = new FineLongestConsecutiveString();
        System.out.print("Nhập chuỗi: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("chuỗi con được sắp xếp theo thứ tự có độ dài lớn nhất là: " + find.findLongestConsecutiveString(str));
    }
}
