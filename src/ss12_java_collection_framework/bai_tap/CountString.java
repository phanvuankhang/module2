package ss12_java_collection_framework.bai_tap;

import java.util.*;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập văn bản: ");
        String text = scanner.nextLine();
        text = text.toLowerCase();
        String[] words = text.split(" ");
        TreeMap<String, Integer> wordsCount = new TreeMap<>();
        for (String w : words) {
            if (wordsCount.containsKey(w)) {
                int count = wordsCount.get(w);
                wordsCount.put(w, count + 1);
            } else {
                wordsCount.put(w, 1);
            }
        }
        List<String> sortWord = new ArrayList<>(wordsCount.keySet());
        Collections.sort(sortWord);
        for (String s : sortWord) {
            System.out.print(s + ": " + wordsCount.get(s) + ", ");
        }
    }
}
