package filewriter;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        File outputFile = new File("src/fileio/output.txt");
        FileReader fileReader = new FileReader(outputFile);
        int b;
        while ((b = fileReader.read()) != -1) {
            System.out.print((char) b);
        }
    }
}
