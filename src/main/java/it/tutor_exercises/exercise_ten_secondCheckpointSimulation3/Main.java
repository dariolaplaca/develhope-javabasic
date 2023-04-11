package it.tutor_exercises.exercise_ten_secondCheckpointSimulation3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("src/main/java/it/tutor_exercises/exercise_ten_secondCheckpointSimulation3/test.txt");
        List<String> lines = loadLines(filePath);
        System.out.println(totalNumberOfWords(lines));
        System.out.println(totalNumberOfWordsStream(lines));
        List<String> uniqueWords = deleteRepeatedWords(lines);
        System.out.println(sortList(uniqueWords));
        Path outputFilePath = Path.of("src/main/java/it/tutor_exercises/exercise_ten_secondCheckpointSimulation3/file_modified.txt");
        writeFile(sortList(uniqueWords), outputFilePath);
    }

    public static List<String> loadLines(Path filePath) throws IOException{
        return Files.readAllLines(filePath);
    }

    public static int totalNumberOfWords(List<String> lines){
        int wordCount = 0;
        for (String phrase : lines){
            for (String word : phrase.split(" ")){
                if(word.isEmpty()) continue;
                wordCount++;
            }
        }
        return wordCount;
    }

    public static int totalNumberOfWordsStream(List<String> lines){
        return lines.stream()
                .filter(phrase -> !phrase.isEmpty())
                .mapToInt(phrase -> phrase.split(" ").length)
                .sum();
    }

    public static List<String> deleteRepeatedWords(List<String> lines){
        HashSet<String> foundWords = new HashSet<>();
        List<String> finalList = lines;
        for(String phrase : lines){
            for(String word : phrase.split(" ")){
                if(!foundWords.contains(word)){
                    foundWords.add(word);
                } else {
                    finalList = finalList.stream()
                            .flatMap(phraseToSplit -> Arrays.stream(phraseToSplit.split(" ")))
                            .filter(wordToFilter -> !wordToFilter.equals(word))
                            .toList();
                }
            }
        }
        return finalList;
    }

    public static List<String> sortList(List<String> lines){
        return lines.stream().sorted().toList();
    }

    public static void writeFile(List<String> lines, Path filePath) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath.toFile()));
        for(String word : lines){
            bw.write(word + "\n");
        }
        bw.close();

    }


}

