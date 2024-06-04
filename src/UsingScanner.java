import java.util.Scanner;

public class UsingScanner {
    public static void main (String[] args){

        System.out.println("Enter first number : ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.println("Enter second number : ");
        //Scanner scanner1 = new Scanner(System.in);
        int num2 =scanner.nextInt();

        int sum = num1+num2;
        System.out.println("The sum of two numbers is : " +sum);

        System.out.println("Enter company name : ");
        String companyName = scanner.next();
         System.out.println(companyName);

    }
}
