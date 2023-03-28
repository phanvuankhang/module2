package ss16_text_file.thuc_hanh.max_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<Integer> readFile(String pathFlie) {
        List<Integer> numbers = new ArrayList<>();
        File file = new File(pathFlie);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fie không tồn tại hoặc nội dung có lỗi!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return numbers;
    }
    public void writeFlie(String pathFlie, int max){
        File file=new File(pathFlie);
        FileWriter fileWriter= null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất là: "+max);
            fileWriter.close();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
