package TestFile.WriteFile;

public class WriteTestFileTest {
    public static void main(String[] args) {
        String filePath = "TestFile/TestFile.txt";
        WriteTestFile writeTestFile = new WriteTestFile();
        writeTestFile.writeFile(filePath);
    }
}
