package it.checkpoint_two;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "src/main/java/it/checkpoint_two/testo.txt";
        String finalFilePath = "src/main/java/it/checkpoint_two/testo_finale.txt";
        List<String> lines = processFile(filePath);
        HashMap<Character, Integer> myMap = processLines(lines);
        writeResult(finalFilePath, myMap);
    }

    public static List<String> processFile(String fileName) throws IOException{
        return Files.readAllLines(Path.of(fileName)).stream().map(String::strip).toList();
    }

    public static HashMap<Character, Integer> processLines(List<String> lines){
        HashMap<Character, Integer> finalMap = new HashMap<>();
        for(String line : lines){
            if(line.isEmpty()) {
                System.out.println("Error");
            } else {
                for(String word : line.split("\\s")){
                    if(finalMap.containsKey(word.charAt(0))){
                        finalMap.put(word.charAt(0), finalMap.get(word.charAt(0)) + 1);
                    } else {
                        finalMap.put(word.charAt(0), 1);
                    }
                }
            }

        }
        return finalMap;
    }

    public static void writeResult(String fileName, HashMap<Character, Integer> map) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        for(Character c : map.keySet()){
            bw.write(c + " -> " + map.get(c) + "\n");
        }
        bw.close();
    }
}
