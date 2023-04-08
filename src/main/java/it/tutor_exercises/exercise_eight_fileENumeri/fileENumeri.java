package it.tutor_exercises.exercise_eight_fileENumeri;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fileENumeri {

    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("src/main/java/it/tutor_exercises/exercise_eight_fileENumeri/numeri.txt");
        readFile(filePath);
    }

    public static void readFile(Path pathFile) throws IOException {
        int result = 0;

        List<String> righe = Files.readAllLines(pathFile);
        List<Integer> allIntegers = new ArrayList<>();
        for(String riga : righe){
            if(riga.contains(",")){
                for (String n : riga.split(",")){
                    allIntegers.add(Integer.parseInt(n));
                }
            }
            else {
                allIntegers.add(Integer.parseInt(riga));
            }
        }

        if(allIntegers.size() > 2){
            result = allIntegers.stream().reduce(0, Integer::sum);
            System.out.println(result);
        } else if (allIntegers.size() == 1) {
            System.out.println(allIntegers.get(0));
        } else if (allIntegers.size() == 0) {
            System.out.println("Il file di testo è vuoto");
        } else {
            result = allIntegers.stream().reduce(1, (a,b) -> a*b);
            System.out.println(result);
        }
    }


}

