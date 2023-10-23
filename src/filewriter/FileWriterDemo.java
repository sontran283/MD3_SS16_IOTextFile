package filewriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        File outputFile = new File("src/FileWriter/output.txt");
        outputFile.createNewFile();
        FileWriter fileWriter = new FileWriter(outputFile);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        writer.write("hello world");
        writer.close();
    }
}
