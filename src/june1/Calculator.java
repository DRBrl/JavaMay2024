package june1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("************************");
        System.out.println("Welcome to my Calculator");
        System.out.println("************************");

        System.out.println("1. Press 1 for Addition");
        System.out.println("2. Press 2 for Subtraction");
        System.out.println("3. Press 3 for Multiplication");
        System.out.println("4. Press 4 for Division");
        System.out.println("5. Press 5 for Modulus");
        System.out.println("6. Press 6 for Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your selection");
        CalDemo calculator = new CalDemo();

        int input = scanner.nextInt();
        switch (input) {
            case 1:

                calculator.sum();

                break;

            case 2:

                calculator.sub();

                break;

            case 3:

                calculator.mul();

                break;

            case 4:

                calculator.div();

                break;

            case 5:

                calculator.rem();

                break;

            case 6:

                break;
        }
    }
}
