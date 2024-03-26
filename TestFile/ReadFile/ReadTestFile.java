package TestFile.ReadFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadTestFile {
    public void readFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Scanner scanner = new Scanner(System.in);
            System.out.println("The content of the file TestFile.txt.");
            String line = "";
            int countData = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                countData++;
            }
            bufferedReader.close();
            System.out.println("Number of data: " + countData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
