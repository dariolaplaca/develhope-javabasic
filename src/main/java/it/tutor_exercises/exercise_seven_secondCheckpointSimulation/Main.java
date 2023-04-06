package it.tutor_exercises.exercise_seven_secondCheckpointSimulation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "src/main/java/it/tutor_exercises/exercise_seven_secondCheckpointSimulation/example.txt";
        String filePath2 = "src/main/java/it/tutor_exercises/exercise_seven_secondCheckpointSimulation/example2.txt";
        List<String> lines = loadLines(filePath);
        HashMap<String, Integer> processedLines = processLines(lines);
        writeLines(filePath2, processedLines);
    }

    public static List<String> loadLines(String filePath) throws IOException {
        return Files.readAllLines(Path.of(filePath));
    }

    public static HashMap<String, Integer> processLines(List<String> lines){
        HashMap<String, Integer> processedLines = new HashMap<>();
        for(String line : lines){
            if(line.length() == 0) continue;
            if(!line.contains("$")){
                System.out.println("THIS LINE IS NOT WELL FORMATTED!");
            } else {
                String[] splittedLine = line.split("\\$");
                 String key = splittedLine[0].strip();
                 int value = splittedLine[1].strip().split(" ").length;
                processedLines.put(key, value);
            }
        }
        return processedLines;
    }

    public static void writeLines(String filePath, HashMap<String, Integer> processedLines) throws IOException {
        FileWriter fw = new FileWriter(filePath);
        BufferedWriter bw = new BufferedWriter(fw);
        for(String key : processedLines.keySet()){
            String line = key.toUpperCase() + " - " + processedLines.get(key) + "\n";
            bw.write(line);
        }
        bw.close();
    }
}
