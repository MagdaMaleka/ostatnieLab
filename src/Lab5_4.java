import javafx.scene.control.TableView;

import javax.swing.text.TabableView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab5_4 {
    public static void main(String[] args) {

        Integer[] myTablica = new Integer[3];
        myTablica[0] = 1;
        myTablica[1] = 2;
        myTablica[2] = 3;

        printTablica(myTablica);

        String[] myTablica2 = new String[3];
        myTablica2[0] = "a";
        myTablica2[1] = "b";
        myTablica2[2] = "c";

        printTablica(myTablica2);

    }

    public static <T> void printTablica(T[] tablica){

        for (T e : tablica) {
            System.out.println(e + " ");
        }
        System.out.println();
    }

    class Generic <X, Y, Z>{
        private X objectX;
        private Y objectY;
        private Z objectZ;
    }
}
