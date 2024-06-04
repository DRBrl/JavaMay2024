import java.util.Scanner;

public class ConditionalStatPractise {
    public static void main(String[] args) {

        /* Requirement
        1. check if the number given is even/odd
        2. given number x = user input, y = user input and check which one is greater
        3. given 3 numbers x,y,z check the greater of all... user input
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();

        boolean result = ( num % 2 ==0);

        if(result) {
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
    }
}
