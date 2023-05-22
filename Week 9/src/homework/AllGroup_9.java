package homework;

import java.util.ArrayList;

public class AllGroup_9 {
    public static void main(String[] args) {
        ArrayList<String> GroupName=new ArrayList<>();
        GroupName.add("Java");
        GroupName.add("Selenium");
        GroupName.add("PostMan");

        System.out.println("List of Group Name: ");
        for(String gn:GroupName){
            System.out.println(gn);
        }
    }
}
