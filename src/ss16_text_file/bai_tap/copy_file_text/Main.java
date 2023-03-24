package ss16_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        copyFile("src\\ss16_text_file\\bai_tap\\copy_file_text\\SourceFile.csv");
    }

    public static void copyFile(String pathSource) {
        File fileSource = new File(pathSource);
        try {
            FileReader fileReader = new FileReader(fileSource);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            File fileTarget = new File("src\\ss16_text_file\\bai_tap\\copy_file_text\\TargetFile.csv");
            FileWriter fileWriter = new FileWriter(fileTarget);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            List<String> stringList = new ArrayList<>();
            String line;
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                Collections.addAll(stringList, line.split(""));
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != ' ') {
                        count++;
                    }
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("Số ký tự: " + count);
            for (String s : stringList) {
                System.out.print(s);
                bufferedReader.close();
                bufferedWriter.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nguồn không tồn tại hoặc tập tin đích đã tồn tại.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
