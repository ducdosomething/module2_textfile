package CSVReader;

public class Main {
    public static void main(String[] args) {
        String csvFilePath = "CSVReader/example.csv";
        FunctionCsvFile testCsvFile = new FunctionCsvFile();
        testCsvFile.writeCSVFile(csvFilePath);
        testCsvFile.displayCountry(csvFilePath);
    }
}
