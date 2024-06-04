package may25;

import java.util.Scanner;

public class CalculatorDemo {
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

        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter two numbers");
        int input = sc.nextInt();

//        int add = input1+input;
//        int sub = input-input1;
//        int mul = input*input1;
//        int div = input/input1;
//        int mod = input%input1;

        switch (input){
            case 1:
                System.out.println("Enter two numbers");
                Double x = sc.nextDouble();
                Double y = sc.nextDouble();
                double add=x+y;
                System.out.println("Addition is "+ add);
                break;

            case 2:
                System.out.println("Enter two numbers");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double sub=a-b;
                System.out.println("Subtraction is "+ sub);
                break;


            case 3:
                System.out.println("Enter two numbers");
                double num = sc.nextDouble();
                double num1 = sc.nextDouble();
                double mul=num1*num;
                System.out.println("Multiplication is "+ mul);
                break;


            case 4:
                System.out.println("Enter two numbers");
                double num2 = sc.nextDouble();
                double num3 = sc.nextDouble();
                double div=num2/num3;
                System.out.println("division is "+ div);
                break;


            case 5:
                System.out.println("Enter two numbers");
                double num4 = sc.nextDouble();
                double num5 = sc.nextDouble();
                double mod=num4+num5;
                System.out.println("Reminder is "+ mod);
                break;


            case 6:
                break;
        }
    }
}
