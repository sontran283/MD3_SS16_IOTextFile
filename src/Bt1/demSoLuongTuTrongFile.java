package Bt1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class demSoLuongTuTrongFile {
    public static void main(String[] args) {
        String filePath = "src/Bt1/file.txt";

        try {
            String content = readFile(filePath);
            int wordCount = countWords(content);

            System.out.println("Số lượng từ trong file: " + wordCount);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
        }
    }

    public static String readFile(String filePath) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
        }

        return contentBuilder.toString();
    }

    public static int countWords(String content) {
        String[] words = content.split("\\s+");
        return words.length;
    }
}
