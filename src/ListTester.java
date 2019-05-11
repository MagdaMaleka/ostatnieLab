import java.util.*;

public class ListTester {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(123);
        myList.add(4);

        System.out.println(myList);
        System.out.println(myList.remove(0));
        System.out.println(myList);
        System.out.println(myList.size());
        myList.clear();
        System.out.println(myList);

        System.out.println("-------------------------------------");

        List myList2 = new ArrayList<>();
        myList2.add(1);
        myList2.add(new Object());
        myList2.add("siedem");

        System.out.println(myList2.get(0));
        System.out.println(myList2.get(1));
        System.out.println(myList2.get(2));

        System.out.println((int)myList2.get(0) + (String)myList2.get(2));

        System.out.println("---------------------------------------");

        List<Integer> myList3 = new ArrayList<>();
        myList3 = Arrays.asList(1,2,4,66,7,98,44,452,2,23,45);

       // System.out.println(myList3.get(0));
       // System.out.println(myList3.size());


        for (int i = 0; i < myList3.size(); i++){
            System.out.println(myList3.get(i));

        }

        for (Integer i : myList3){
            System.out.println(i);
        }

    /*    System.out.println("--------------------------------------");

        Iterator<Integer> iterator = myList3.listIterator();

        while (iterator.hasNext()){
            if (iterator.next() == 7) {
                iterator.remove();
            }
           // System.out.println("Liczba: " + iterator.next());
            System.out.println(myList3);
        }
*/
        System.out.println("-------------------------------------");

        Iterator<Integer> iterator = myList3.listIterator();

        while (iterator.hasNext()){
            Integer e = iterator.next();
            if (e%2 == 0) {
                System.out.println(e);
            }
        }

        System.out.println("---------------------------------------");

        List<String> myList4 = new LinkedList<>();
        myList4 = new LinkedList<>(Arrays.asList("a","b","c","a"));
/*        myList4.add("pierwszy");
        myList4.add("drugi");
        myList4.add("trzeci");
        myList4.add("czwarty");
        myList4.add("czwarty");

        System.out.println(myList4);

        myList4.add(0,"zerowy");
        System.out.println(myList4);
        myList4.remove("drugi");
        System.out.println(myList4);*/

        System.out.println("Występuje: " + Collections.frequency(myList4, "a"));




    }
}
