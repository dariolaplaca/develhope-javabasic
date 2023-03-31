package it.tutor_exercises.exercise_six_Parole_E_File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class FileAndParole {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("src/main/java/it/tutor_exercises/exercise_six_Parole_E_File/text_input");
        stampaParole(file);
        System.out.println(occorrenzeParole(file));
    }

    public static void stampaParole(Path file) throws IOException {
        List<String> righe = Files.readAllLines(file);
        for(String riga : righe){
            System.out.println(riga);
        }
    }

    public static HashMap<String, Integer> occorrenzeParole(Path file) throws IOException {
        List<String> righe = Files.readAllLines(file);
        HashMap<String, Integer> parole = new HashMap<>();
        for(String riga : righe){
            for(String parola : riga.split(" ")){
                if(parole.containsKey(parola)){
                    int quanteParolePresenti = parole.get(parola);
                    parole.put(parola, quanteParolePresenti + 1 );
                } else {
                    parole.put(parola, 1);
                }
            }
        }
        return parole;
    }
}
