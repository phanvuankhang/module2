package ss2_loop_statement_java.bai_tap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên là:");
        int number = 20;
        int count = 0;
        int n = 2;
        while (count < number) {
            boolean flag = true;
            for (int j = 2; j < n; j++) {
                int IsDivisibleByJ = n % j;
                if (IsDivisibleByJ == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
}
