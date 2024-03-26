package CopyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyProgram {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopyProgram <sourceFilePath> <destinationFilePath>");
            return;
        }

        String sourceFilePath = args[0];
        String destinationFilePath = args[1];

        File sourceFile = new File(sourceFilePath);
        File destinationFile = new File(destinationFilePath);

        try {
            copyFile(sourceFile, destinationFile);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }

    private static void copyFile(File sourceFile, File destinationFile) throws IOException {
        if (!sourceFile.exists()) {
            throw new IOException("Source file does not exist.");
        }

        if (!sourceFile.isFile()) {
            throw new IOException("Source is not a file.");
        }

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(sourceFile);
            outputStream = new FileOutputStream(destinationFile);

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
