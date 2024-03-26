package CopyFile;

public class FileCopyProgram {
    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        String sourceFilePath = "CopyFile/sourceFilePath.txt";
        String destinationFilePath = "CopyFile/destinationFilePath.txt";
        copyFile.copyFile(sourceFilePath, destinationFilePath);
    }
}
