package May28;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        char choice;


        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int sum = sc.nextInt();
            int mul;


            for (mul = 1; mul <= 10; mul++) {
                //sum = mul+sum;
                System.out.println(mul + "*" + sum + "=" + mul * sum);
            }
            System.out.println("Do you want to continue? (Y/N)");
            choice=sc.next().charAt(0);
        } while (choice=='y'||choice=='Y');
    }
}
