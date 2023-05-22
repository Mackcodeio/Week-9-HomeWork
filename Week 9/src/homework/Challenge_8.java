package homework;

import java.util.ArrayList;

public class Challenge_8 {
    public static void main(String[] args) {
        ArrayList<String> station = new ArrayList<>();

        // Zone 1 covers the West End, the Holborn district, Kensington, Paddington and the City of London, as well as Old Street, Angel, Pimlico, Tower Gateway, Aldgate East, Euston, Vauxhall, Elephant & Castle, Borough, London Bridge, Earl's Court, Marylebone, Edgware Road, Lambeth North and Waterloo.
        station.add("West End");
        station.add("The Holborn district");
        station.add("Kensington");
        station.add("Paddington");
        station.add("City of London");

        System.out.println("List of stations in London fare zone 1");
        for(String name:station){
                System.out.print(name +", ");
        }
    }
}
