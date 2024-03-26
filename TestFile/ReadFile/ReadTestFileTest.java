package TestFile.ReadFile;

public class ReadTestFileTest {
    public static void main(String[] args) {
        String filePath = "TestFile/TestFile.txt";
        ReadTestFile readTestFile = new ReadTestFile();
        readTestFile.readFile(filePath);
    }
}
