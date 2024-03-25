package SumFromFile;

public class Main {
    public static void main(String[] args) {
        String filePath = "SumFromFile/numbers.txt";
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(filePath);
    }
}
