package homework;

import java.util.HashMap;

public class HashMap_7 {
    public static void main(String[] args) {
        HashMap<String,Integer> language = new HashMap<>();

        // Add keys and values (Language, Version)
        language.put("Ruby",3);
        language.put("JavaScript",6);
        language.put("Python",4);
        language.put("C++",3);
        language.put("Java",8);

        // iterate through Value only
        System.out.print("Value : ");
        for(Integer value : language.values()){
            System.out.print(value);
            System.out.print(", ");
        }

    }
}
