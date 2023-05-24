package homework.calculate_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter Second number: ");
        int number2 = sc.nextInt();
        System.out.print("Pelase enter one of symbol +,-,*,/ :");
        String symbol= sc.next();

        cal.calculateResult(number1,number2,symbol);

        System.out.print("Would you like to do more calculation Please enter Y or N :");
        String isMore = sc.next();

        while(isMore.equalsIgnoreCase("y")){
            cal.calculateResult(number1,number2,symbol);
        }
    }
}
