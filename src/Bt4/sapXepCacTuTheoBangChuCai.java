package Bt4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class sapXepCacTuTheoBangChuCai {
    public static void main(String[] args) {
        String filePath = "src/Bt4/file.txt";

        try {
            String content = readFile(filePath);
            String[] words = splitWords(content);
            sortWords(words);

            System.out.println("Các từ sau khi được sắp xếp theo thứ tự bảng chữ cái:");
            for (String word : words) {
                System.out.println(word);
            }
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
        }
    }


    private static String readFile(String filePath) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append("\n");
            }
        }

        return contentBuilder.toString();
    }

    private static String[] splitWords(String content) {
        return content.split("\\s+");
    }

    private static void sortWords(String[] words) {
        Arrays.sort(words);
    }
}

