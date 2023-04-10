package it.tutor_exercises.exercise_nine_secondCheckpointSimulation2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("src/main/java/it/tutor_exercises/exercise_nine_secondCheckpointSimulation2/input.txt");
        List<String> allLines = readFile(filePath);
        System.out.println(allLines);
        System.out.println("---------------------------------");
        List<String> allLinesWithoutThe = removeWord(allLines, "the");
        System.out.println(allLinesWithoutThe.toString());
        System.out.println("---------------------------------");
        List<String> allLinesReplaced = replaceWord(allLinesWithoutThe, "and", "&");
        System.out.println(allLinesReplaced.toString());
        System.out.println("---------------------------------");
        writeFile(allLinesReplaced, Path.of("src/main/java/it/tutor_exercises/exercise_nine_secondCheckpointSimulation2/output.txt"));
    }

    public static List<String> readFile(Path filePath) throws IOException {
        return Files.readAllLines(filePath);
    }

     public static List<String> removeWord(List<String> list, String wordToRemove) {
        return list.stream().map(phrase -> phrase.replaceAll(wordToRemove, "")).toList();
     }

     public static List<String> replaceWord(List<String> list, String oldWord, String newWord) {
         return list.stream().map(phrase -> phrase.replaceAll(oldWord, newWord)).toList();
     }

     public static void writeFile(List<String> list, Path filePath) throws IOException {
         BufferedWriter bw = new BufferedWriter(new FileWriter(filePath.toFile()));
         for(String phrase : list){
             bw.write(phrase);
         }
         bw.close();
     }
}
