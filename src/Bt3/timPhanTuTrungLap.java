package Bt3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class timPhanTuTrungLap {
    public static void main(String[] args) throws IOException {
        String filePath = "src/Bt3/file.txt";

        try {
            String content = readFile(filePath);
            List<String> abc = findWords(content);

            System.out.println("cac tu trung lap trong file: ");
            for (String word : abc) {
                System.out.println(word);
            }
        } catch (Exception e) {
            System.out.println("ko hop le");
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

    private static List<String> findWords(String content) {
        String[] words = content.split("\\s+");
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            int count = wordCountMap.getOrDefault(word, 0);
            wordCountMap.put(word, count + 1);
        }

        List<String> duplicateWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateWords.add(entry.getKey());
            }
        }

        return duplicateWords;
    }
}
