import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserCollector {

    public static void main(String[] args) {


        Map<Integer, User> map = new HashMap<>();
        map.put(1, new User("Ola", "Nowak", 20));
        map.put(2, new User("Jan", "Kowalski", 45));
        map.put(3, new User("Jan", "Kowalski", 45));

        Set<Integer> keys = map.keySet();
        System.out.println(keys);

        System.out.println("---");

        System.out.println(map.containsKey(2));

        System.out.println("---");

        System.out.println(map.get(1));

        System.out.println("---");

        for (User user: map.values()){
            System.out.println(user);
        }


    }
}
