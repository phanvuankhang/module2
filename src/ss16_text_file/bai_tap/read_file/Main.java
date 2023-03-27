package ss16_text_file.bai_tap.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        File file = new File("src\\ss16_text_file\\bai_tap\\read_file\\Countries.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            Country country=null;
            String[] nation;
            while ((line = bufferedReader.readLine()) != null) {
                nation = line.split(",");
                country = new Country(Integer.parseInt(nation[0]),nation[1],nation[2]);
                System.out.println(country);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
