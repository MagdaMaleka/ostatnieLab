import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTester {
    public static void main(String[] args) {
/*        Set<String> mySet = new HashSet<>();
        mySet.add("Wojtek");
        mySet.add("Agata");
        mySet.add("Wojtek");
        mySet.add("Tomek");
        mySet.add("Wojtek");

        System.out.println("Ile elementów: " + mySet.size());

        for (String s:mySet){
            System.out.println(s);
        }

        System.out.println();

        mySet.remove("Wojtek");

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("--------------------------------");

        Iterator<String> iterator1 = mySet.iterator();
        while(iterator1.hasNext()){
            String name = iterator1.next();
            System.out.println(name + " " + name.hashCode());
        }

        System.out.println();

        String a = "Tomek";
        String b = "Tomek";
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() + " " + b.hashCode());
    }*/

    Set<A> mySet = new HashSet<>();

    for (int i = 0; i<100; i++){
        mySet.add(new A(1,"aaa"));
    }
        System.out.println(mySet.size());

    }
}
