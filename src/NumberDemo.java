import java.util.Scanner;

public class NumberDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();

        boolean result = num>=0;

        if(result) {
            System.out.println("Number is positive");
        }else {
            System.out.println("Number is negative");
        }
    }
}
