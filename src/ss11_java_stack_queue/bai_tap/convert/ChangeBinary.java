package ss11_java_stack_queue.bai_tap.convert;

import java.util.Scanner;
import java.util.Stack;

public class ChangeBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hệ thập phân cần đổi.");
        int decimal = Integer.parseInt(scanner.nextLine());
        while (decimal > 0) {
            int surplus = decimal % 2;
            stack.push(surplus);
            decimal = decimal / 2;
        }
        int number = stack.size();
        System.out.println("Số nhị phân là: ");
        for (int i = 0; i < number; i++) {
            System.out.print(stack.pop());
        }
    }
}
