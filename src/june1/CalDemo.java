package june1;

//import java.sql.SQLOutput;
import java.util.Scanner;

public class CalDemo {

    Scanner scanner = new Scanner(System.in);
    public void sum(){

        System.out.println("Enter the first number");
        int a = scanner.nextInt();

        System.out.println("Enter Second number");
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("Sum is :"+sum);

    }

    public void sub(){

        System.out.println("Enter the first number");
        int a = scanner.nextInt();

        System.out.println("Enter Second number");
        int b = scanner.nextInt();

        int sub = a - b;

        System.out.println("Subtraction is :"+sub);
    }

    public void mul(){

        System.out.println("Enter the first number");
        int a = scanner.nextInt();

        System.out.println("Enter Second number");
        int b = scanner.nextInt();

        int mul = a * b;

        System.out.println("Mul is :"+mul);
    }
    public void div(){

        System.out.println("Enter the first number");
        int a = scanner.nextInt();

        System.out.println("Enter Second number");
        int b = scanner.nextInt();

        int div = a / b;

        System.out.println("division is :"+div);
    }
    public void rem(){

        System.out.println("Enter the first number");
        int a = scanner.nextInt();

        System.out.println("Enter Second number");
        int b = scanner.nextInt();

        int rem = a % b;

        System.out.println("rem is :"+rem);
    }
}
