package ss4_class_va_constructor.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class StopWatch {
    long startTime;
    long endTime;

    StopWatch() {
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int maxIndex = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIndex = j;
                }
            }
            arr[maxIndex] = arr[i];
            arr[i] = max;
        }
        System.out.println(Arrays.toString(arr));
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime() + " millisecond");
    }
}
