package Bt5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class tuCoDoDaiLonNhat {
    public static void main(String[] args) {
        String filePath = "src/Bt5/file.txt";


        try {
            String content = readFile(filePath);
            String[] words = splitWords(content);
            List<String> longestWords = findLongestWords(words);
            int maxLength = longestWords.get(0).length();

            System.out.println("Các từ có độ dài lớn nhất trong file:");
            for (String word : longestWords) {
                System.out.println("Từ: " + word + ", Độ dài: " + maxLength);
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

    public static String[] splitWords(String content) {
        return content.split("\\s+");
    }


    private static List<String> findLongestWords(String[] words) {
        List<String> longestWords = new ArrayList<>();
        int maxLength = 0;

        for (String word : words) {
            int length = word.length();

            if (length > maxLength) {
                longestWords.clear();
                longestWords.add(word);
                maxLength = length;
            } else if (length == maxLength) {
                longestWords.add(word);
            }
        }

        return longestWords;
    }
}
