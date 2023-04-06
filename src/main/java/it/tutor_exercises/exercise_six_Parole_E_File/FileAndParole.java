package it.tutor_exercises.exercise_six_Parole_E_File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileAndParole {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("src/main/java/it/tutor_exercises/exercise_six_Parole_E_File/text_input");
        System.out.println(paroleInRima(file));
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
        Files.lines(file).forEach(riga -> Arrays.stream(riga.split(" ")));
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

    public static HashMap<String, Integer> occorrenzeParoleTesto(Path file) throws IOException {
        List<String> righe = Files.readAllLines(file);
        HashMap<String, Integer> parole = new HashMap<>();
        for(String riga : righe){
            riga = riga.replaceAll("\\W+"," ").toLowerCase();
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

    public static HashMap<String, ArrayList<String>> paroleInRima(Path file) throws IOException {
        HashMap<String, ArrayList<String>> rime = new HashMap<>();
        List<String> righe = Files.readAllLines(file);
        for (String riga : righe){
            riga = riga.replaceAll("\\W"," ").toLowerCase();
            for (String parola : riga.split(" ")) {
                if (parola.length() >= 4) {
                    String rima = trovaRimaFinale(parola);
                    if (rima != null) {
                        ArrayList<String> listaParole = rime.getOrDefault(rima, new ArrayList<String>());
                        listaParole.add(parola);
                        rime.put(rima, listaParole);
                    }
                }
            }
        }
        return rime;
    }

    private static String trovaRimaFinale(String parola) {
        String vocConVoc = "[aeiou][bcdfghjklmnpqrstvwxyz][aeiou]";
        String vocConConsVoc = "[aeiou][bcdfghjklmnpqrstvwxyz][bcdfghjklmnpqrstvwxyz][aeiou]";
        Pattern vocConVocPattern = Pattern.compile(vocConVoc, Pattern.CASE_INSENSITIVE);
        Pattern vocConConVocPattern = Pattern.compile(vocConConsVoc, Pattern.CASE_INSENSITIVE);

        if (vocConVocPattern.matcher(parola).find()){
            return parola.substring(parola.length()-3);
        } else if (vocConConVocPattern.matcher(parola).find()) {
            return parola.substring(parola.length()-4);
        } else {
            return null;
        }
    }

}
