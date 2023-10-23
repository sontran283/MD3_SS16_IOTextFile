package Bt2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Main {
    // Viết chương trình đọc nội dung từ file text và đếm số dòng trong file đó.
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("src/Bt2/demSoDong.txt");
            file.createNewFile();
            if (file.exists()) {
                FileReader fr = new FileReader(file);
                LineNumberReader lnr = new LineNumberReader(fr);
                int lineNumber = 0;

                while (lnr.readLine() != null) {
                    lineNumber ++;
                }
                System.out.println("so dong trong file la: " + lineNumber);
                lnr.close();
            }
        } catch (IOException e) {
            System.err.println("ko xac dinh");
        }
    }
}
