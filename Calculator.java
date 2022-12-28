import java.util.Scanner;

public class Calculator {
    /**
     * I want to make a calculator app
     * for the start, I want to be able to multiply and divide numbers
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input first number:");
        // after getting a bit of text from the user, convert that into a double
        String n1input = sc.nextLine();
        double n1 = Double.parseDouble(n1input);

        System.out.println("input second number");
        String n2input = sc.nextLine();
        double n2 = Double.parseDouble(n2input);

        System.out.println("input 'multiply' or 'divide'");
        String action = sc.nextLine();

        if(action.equals("multiply")){
            double result = multiply(n1, n2);
            System.out.println("result: "+result);
        }else if(action.equals("divide")){
            double result = divide(n1, n2);
            System.out.println("result: "+result);
        }
    }

    public static double multiply(double a, double b){
        return a*b;
    }

    public static double divide(double a, double b){
        return a/b;
    }

    /*
     * let's decide on what primitive datatypes we'll be using
     * bytes (very short numbers)
     * shorts (short numbers)
     * ints (whole numbers up to about ~2 billion)
     * floats (decimal numbers that tend to be innacurate)
     * doubles (accurate decimal numbers)
     * booleans (true/false values)
     * char (single characters)
     */

     /**
      * generally, methods
      * method return types
      * method parameters
      * primitive types
      * Strings
      */
}