package May28;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        char c;

        do {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 for reminder");
            System.out.println("Enter 6 for exit");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the input");
            int input = sc.nextInt();
            int x;
            int y;

            switch (input) {

                case 1:
                    System.out.println("Enter two numbers");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    int sum = x + y;
                    System.out.println("The sum is :" + sum);
                    break;

                case 2:
                    System.out.println("Enter two numbers");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    int sub = x - y;
                    System.out.println("The sub is :" + sub);
                    break;

                case 3:
                    System.out.println("Enter two numbers");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    int mul = x * y;
                    System.out.println("The mul is :" + mul);
                    break;

                case 4:
                    System.out.println("Enter two numbers");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    int div = x / y;
                    System.out.println("The div is :" + div);
                    break;

                case 5:
                    System.out.println("Enter two numbers");
                    x = sc.nextInt();
                    y = sc.nextInt();
                    int rem = x % y;
                    System.out.println("The rem is :" + rem);
                    break;

                case 6:
                    System.out.println("see you next time");
                    break;
            }
            System.out.println("Do you want to continue? (Y/N)");
            c = sc.next().charAt(0);

        } while (c == 'y' || c == 'Y');
    }
}
