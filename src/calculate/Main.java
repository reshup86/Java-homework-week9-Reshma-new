package calculate;

import java.util.Scanner;

public class Main extends Calculator { //inheritance creation

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator(); //Object creation for method calling from base class

        while (true) {
            System.out.print("Enter first number: ");
            int firstNum = scanner.nextInt();
            System.out.print("\nEnter second number: ");
            int secondNum = scanner.nextInt();
            System.out.print("\nPlease enter any one symbol +,-,*,/ : ");
            char symbol = scanner.next().charAt(0);

            try{
                calculator.calculateResult(firstNum, secondNum, symbol);
            } catch (ArithmeticException e){
                System.out.println("Invalid Operation");
            }

            //checking if user wants to continue with more calculation
            System.out.println("Would you like to do more calculation. Please enter 'Y' or 'N' : ");
            char moreCalculate = scanner.next().charAt(0);

            if (moreCalculate == 'N' || moreCalculate == 'n') {
                break;
            }
            scanner.close(); //closing the scanner object
        }
    }
}
