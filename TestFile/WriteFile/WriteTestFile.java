package TestFile.WriteFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteTestFile {
    public void writeFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter content to write to the file (Press Enter to finish):");
            String line = "";
            while (!(line = scanner.nextLine()).isEmpty()) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            scanner.close();
            System.out.println("The data has been entered into the file!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
