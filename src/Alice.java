import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Alice {

    public static void main(String[] args) throws IOException{

        List<String> list = Files.readAllLines(Paths.get("src/alice30.txt"));
        Set<String> set = new TreeSet<>();

        for (String line : list){

            line = line.replaceAll("\\p{Punct}|\\d", "");

            String[] words = line.split(" ");
            for(String word: words) {
                if (!word.isEmpty()) {
                    set.add(word.toLowerCase());
                }
            }
            System.out.println();
        }

        for (String word : set){
            System.out.println(word);
        }

        System.out.println();
        System.out.println("Znaleziono różnych wyrazów: " + set.size());
    }
}
