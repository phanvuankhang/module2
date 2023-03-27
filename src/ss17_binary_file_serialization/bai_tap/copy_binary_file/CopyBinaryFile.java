package ss17_binary_file_serialization.bai_tap.copy_binary_file;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyBinaryFile {
    public static void main(String[] args) {
        try {
            File file = new File("src\\ss17_binary_file_serialization\\bai_tap\\copy_binary_file\\product.dat");

            List<String> stringList = new ArrayList<>();
            stringList.add("Phan Vu");
            stringList.add("An Khang");

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(stringList);
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            stringList = (List<String>) objectInputStream.readObject();
            objectInputStream.close();

            File file2 = new File("src\\ss17_binary_file_serialization\\bai_tap\\copy_binary_file\\copy_product.dat");
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream2);

            objectOutputStream2.writeObject(stringList);

            for (String s : stringList) {
                System.out.println(s);
            }
            objectOutputStream2.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } catch (ClassNotFoundException e) {
            e.getMessage();
        }
    }
}
