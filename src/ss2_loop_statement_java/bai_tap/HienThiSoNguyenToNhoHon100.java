package ss2_loop_statement_java.bai_tap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        int n = 2;
        while (n < 100) {
            boolean flag = true;
            for (int i = 2; i < n; i++) {
                int isDivisibleByI = n % i;
                if (isDivisibleByI == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(n + " ");
            }
            n++;
        }
    }
}
