package homework;

import java.util.HashSet;

public class HashSetEx_6 {
    public static void main(String[] args) {

        HashSet<Integer> number = new HashSet<>();
        number.add(4);
        number.add(7);
        number.add(8);

        System.out.println("Number are set in Hashset are: ");

        for(int i=1;i<=10;i++){
            if(number.contains(i)){
                System.out.print(i +", ");
            }else {
                //System.out.println("Number in else: "+i);
            }
        }
    }
}
