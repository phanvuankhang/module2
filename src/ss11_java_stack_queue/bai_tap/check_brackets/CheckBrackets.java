package ss11_java_stack_queue.bai_tap.check_brackets;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : stack) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào biểu thức.");
        String s = scanner.nextLine();
        System.out.println(isValid(s));
    }
}
