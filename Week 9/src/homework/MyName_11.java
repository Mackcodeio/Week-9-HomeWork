package homework;

import java.util.ArrayList;

public class MyName_11 {

    public static void main(String[] args) {
        String myName="Mahesh";

        ArrayList<String> java=new ArrayList<>();
        java.add("krupa");
        java.add("umang");
        java.add("Anish");
        java.add("Nimit");
        java.add("Kruti");
        java.add("Shweta");

        ArrayList<String> Selenium=new ArrayList<>();
        Selenium.add("Vidhi");
        Selenium.add("Meet");
        Selenium.add("Hemina");
        Selenium.add("Hiral");
        Selenium.add("Situ");
        Selenium.add("Dhawal");

        ArrayList<String> Postman=new ArrayList<>();
        Postman.add("Falguniben");
        Postman.add("Punamben");
        Postman.add("Madhavi");
        Postman.add("Mahesh");
        Postman.add("Jignesh");
        Postman.add("Maulik");


        for (String Gp1:java) {
            if(Gp1.equalsIgnoreCase("Mahesh")){
                System.out.println(myName+" Welcome to Java Group");
            }
        }

        for (String Gp2:Selenium) {
            if(Gp2.equalsIgnoreCase("Mahesh")){
                System.out.println(myName+" Welcome to Selenium Group");
            }
        }

        for (String Gp3:Postman) {
            if(Gp3.equalsIgnoreCase("Mahesh")){
                System.out.println(myName+" Welcome to PostMan Group");
            }
        }
    }
}
