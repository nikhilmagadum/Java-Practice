package PracticeFile;

import java.util.*;

class EmptyInputException extends Exception {
    public EmptyInputException(String message) {
        super(message);
    }
}

public class Supai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter paragraph:");
        String input = sc.nextLine();

        try {
            analyzeText(input);
        } catch (EmptyInputException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void analyzeText(String input) throws EmptyInputException {

        if (input == null || input.trim().isEmpty()) {
            throw new EmptyInputException("Input cannot be empty.");
        }

        try {
            // Remove punctuation and convert to lowercase
            String cleanedText = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();

            // Split into words
            String[] words = cleanedText.split("\\s+");

            // Store word frequency
            Map<String, Integer> wordCount = new HashMap<>();

            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            // Identify overused words
            Set<String> overusedWords = new HashSet<>();

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                if (entry.getValue() > 3) {
                    overusedWords.add(entry.getKey());
                }
            }

            // Sort words alphabetically
            List<String> sortedWords = new ArrayList<>(wordCount.keySet());
            Collections.sort(sortedWords);

            // Display results
            for (String word : sortedWords) {
                System.out.println(word + ": " + wordCount.get(word));
            }

            System.out.println("Overused Words: " + overusedWords);

        } catch (NullPointerException e) {
            System.out.println("A null error occurred during processing.");
        }
    }
}