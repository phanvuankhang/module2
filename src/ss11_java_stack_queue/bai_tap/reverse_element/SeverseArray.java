package ss11_java_stack_queue.bai_tap.reverse_element;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SeverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng");
        int size = Integer.parseInt(scanner.nextLine());
        Integer[] integers = new Integer[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + " :");
            int element = Integer.parseInt(scanner.nextLine());
            integers[i] = element;
        }
        System.out.println("Mảng vừa nhập là: " + Arrays.toString(integers));

        Stack<Integer> stack = new Stack<>();
        for (Integer integer : integers) {
            stack.push(integer);
        }
        int size1 = stack.size();
        for (int i = 0; i < size1; i++) {
            integers[i] = stack.pop();
        }
        System.out.println("Mảng sau khi đảo ngược là: " + Arrays.toString(integers));

        System.out.println();
        Stack<String> wStack = new Stack<>();
        System.out.println("Nhập vào một chuỗi.");
        String mWord = scanner.nextLine();
        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(mWord.charAt(i) + "");
        }
        System.out.println("Chuỗi đảo ngược là: ");
        for (int i = 0; i < mWord.length(); i++) {
            System.out.print(wStack.pop());
        }
    }
}
