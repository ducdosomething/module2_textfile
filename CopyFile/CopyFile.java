package CopyFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {
    public void copyFile(String sourceFilePath, String destinationFilePath) {
        try {
            File sourceFile = new File(sourceFilePath);
            if (!sourceFile.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(sourceFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            File destinationFile = new File(destinationFilePath);
            if (!destinationFile.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(destinationFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("File copied successfully!");
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }
}
