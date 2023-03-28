package ss16_text_file.thuc_hanh.sum_file;

import java.io.*;
import java.util.Scanner;

public class SumFile {
    public void readFileText(String pathFile){
        File file= new File(pathFile);
        FileReader fileReader= null;
        BufferedReader bufferedReader=null;
        try {
            fileReader = new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            String line="";
            int sum=0;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            fileReader.close();
            bufferedReader.close();
            System.out.println("Tổng: "+sum);
        } catch (FileNotFoundException e) {
            System.out.println("Fie không tồn tại hoặc nội dung có lỗi!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào đường dẫn file.");
        String pathFile=scanner.nextLine();
        SumFile maxFile=new SumFile();
        maxFile.readFileText(pathFile);
    }
}
