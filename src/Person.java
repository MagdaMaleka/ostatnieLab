import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Person {

    public static final int LIST_SIZE = 100_000;

    public static void main(String[] args) {

        List<Osoba> person = new ArrayList<>();
        Osoba osoba = new Osoba("Ola", "Kowalska");

        Stopwatch stopwatch= new Stopwatch();

        for (int i=0; i<LIST_SIZE; i++){
            person.add(0, osoba);
        }

        stopwatch.show();

        System.out.println();

        for (int a = 0; a<LIST_SIZE/2; a++){
            person.remove(person.get(0));
            person.remove(person.size()-1);
        }

        stopwatch.show();

    }

}
