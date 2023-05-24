package homework.calculate_1;

public class Calculator {
    public void addition(int a,int b){
        System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
    }

    public void subtraction(int a,int b){
        System.out.println("Subtraction of "+a+" and "+b+" is: "+(a-b));
    }
    public void multiplication(int a,int b){
        System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
    }
    public void division(int a,int b){
        System.out.println("Division of "+a+" and "+b+" is: "+(a/b));
    }

    public void calculateResult(int a,int b, String c){

        String add = "+";
        String sub = "-";
        String mul = "*";
        String div = "/";

        if(add.equalsIgnoreCase(String.valueOf(c))){
            addition(a,b);
        } else if (sub.equalsIgnoreCase(String.valueOf(c))) {
            subtraction(a,b);
        }else if (mul.equalsIgnoreCase(String.valueOf(c))){
            multiplication(a,b);
        }else if (div.equalsIgnoreCase(String.valueOf(c))){
            division(a,b);
        }

        System.out.println("---------------------------------------------------------------");
    }
}
