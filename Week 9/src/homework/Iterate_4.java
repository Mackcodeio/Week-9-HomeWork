package homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate_4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("India");
        list.add("Canada");
        list.add("USA");
        list.add("UK");

        Iterator<String> name = list.iterator();

        System.out.println("List of Coutry: ");
        while (name.hasNext()){
            System.out.println(name.next());
        }

    }
}
