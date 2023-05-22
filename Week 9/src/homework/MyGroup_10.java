package homework;

import java.util.ArrayList;

public class MyGroup_10 {
    public static void main(String[] args) {
        ArrayList<String> GroupMember = new ArrayList<>();
        GroupMember.add("Maulikbhai");
        GroupMember.add("Jigneshbhai");
        GroupMember.add("Punamben");
        GroupMember.add("Hemi");
        GroupMember.add("Mahesh");
        GroupMember.add("Madhvi");
        GroupMember.add("Falguniben");

        for (String myName:GroupMember) {
            if(myName.equalsIgnoreCase("Mahesh")){
                System.out.println("My Name in group: "+myName);
            }
        }
    }
}
