package ss16_text_file.thuc_hanh.max_file;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max= numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max<numbers.get(i)){
                max=numbers.get(i);
            }
        }return max;
    }

    public static void main(String[] args) {
    ReadAndWrite readAndWrite=new ReadAndWrite();
    List<Integer> numbers=readAndWrite.readFile("src\\ss16_text_file\\thuc_hanh\\max_file\\numbers.csv");
    int maxValue=findMax(numbers);
    readAndWrite.writeFlie("src\\ss16_text_file\\thuc_hanh\\max_file\\max_file_text.csv",maxValue);
    }
}
