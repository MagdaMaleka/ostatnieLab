import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {

/*        Box<String> box = new Box();
        box.setObject("siedem");

        String s = box.getObject();*/

/*        Pair<String, Integer> p1 = new OrderedPair<>("Tomek", 2);
        Pair<String, String> p2 = new OrderedPair<>("Tomek", "dwa");
        Pair<String, Box<Integer>> p3 = new OrderedPair<>("Celina", new Box<>());*/

        List<String> list = new ArrayList<>();
        list.add("jeden");
        list.add("jeden");
        list.add("dwa");
        list.add("trzy");

        printList(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(3);

        printList(list2);

        List<A> list3 = new LinkedList<>();
        list3.add(new A(1, "a"));
        list3.add(new A(2, "b"));
        list3.add(new A(3, "c"));

        printList(list3);

        Pair<Integer, String> p1 = new OrderedPair<>(1, "jabłko");
        Pair<Integer, String> p2 = new OrderedPair<>(2, "gruszka");

        boolean same = Util.compare(p1,p2);
        System.out.println(same);

    }

    public static void printList(List<?> list){

        for (Object e : list) {
            System.out.println(e + " ");
        }
        System.out.println();
    }

}
    class Box<T> {
        private T object;

        public T getObject() {
            return object;
        }

        public void setObject(T object) {
            this.object = object;
        }
    }

    interface Pair<K, V>{
        K getKey();
        V getValue();
    }

    class OrderedPair<K, V> implements Pair<K, V>{

        private  K key;
        private V value;

        public OrderedPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        @Override
        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    class Util {
        public static<K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2){
            return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
        }
    }

