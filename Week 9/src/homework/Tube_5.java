package homework;

import java.util.ArrayList;

public class Tube_5 {
    public static void main(String[] args) {
        ArrayList<String> tubeName = new ArrayList<>();

        System.out.println("Checking the array list is empty or not! "+tubeName.isEmpty());

        tubeName.add("Victoria line");
        tubeName.add("Jubilee line");
        tubeName.add("Northern");
        tubeName.add("Piccadilly Line");
        tubeName.add("Metropolitan Line");
        tubeName.add("Circle Line");

        System.out.println("List of London Underground tube:  " + tubeName);
        System.out.println("Checking the array list is empty or not! "+tubeName.isEmpty());
        tubeName.removeAll(tubeName);
        System.out.println("Array list after remove all elements: "+tubeName);
        System.out.println("Checking the above array list is empty or not! : "+tubeName.isEmpty());
    }
}
