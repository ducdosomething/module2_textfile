package CSVReader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FunctionCsvFile {
    public void writeCSVFile(String csvFilePath) {
        try {
            File file = new File(csvFilePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("ID, Code, Name\n");

            bufferedWriter.write("1, AU, Australia\n");
            bufferedWriter.write("2, CN, China\n");
            bufferedWriter.write("3, AU, Australia\n");
            bufferedWriter.write("4, CN, China\n");
            bufferedWriter.write("5, JP, Japan\n");
            bufferedWriter.write("6, TH, Thailand\n");

            System.out.println("CSV file created successfully.");
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Error creating CSV file: " + e.getMessage());
        }
    }

    public void displayCountry(String csvFilePath) {
        try {
            File file = new File(csvFilePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            bufferedReader.readLine();
            Set<String> countryNames = new HashSet<>();
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[2];
                countryNames.add(name);
            }
            System.out.println("Unique country names: ");
            for (String countryName : countryNames) {
                System.out.println(countryName);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
    }
}
