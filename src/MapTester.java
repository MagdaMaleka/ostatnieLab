import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTester {
    public static void main(String[] args) {
        Map<String, String> phones = new HashMap<>();
        phones.put("Tomek", "666-444-222");
        phones.put("Alicja", "111-222-333");
        phones.put("Tomek", "888-777-999");
        phones.put("Barbara", "888-777-999");

        System.out.println(phones);

        System.out.println();

        Set<String> keys = phones.keySet();
        System.out.println(keys);

        System.out.println();

        System.out.println(phones.containsKey("Barbara"));

        System.out.println();

        for (String key : keys) {
            System.out.println("Imię: " + key + ", telefon: " + phones.get(key));
        }

        System.out.println();

        for (String value : phones.values()){
            System.out.println("Telefon: " + value);
        }

        System.out.println();

        for (Map.Entry entry : phones.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            entry.setValue("0");
        }

        System.out.println(phones);
    }
}
