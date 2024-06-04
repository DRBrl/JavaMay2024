package may25;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int input =sc.nextInt();

        switch (input){

            case 1:
                System.out.println("switch on the fan");
                break;

            case 2:
                System.out.println("switch on th bubl1");
                break;

            case 3:
                System.out.println("switch on the bulb 3");
                break;

            default:
                System.out.println("no power");
        }

    }
}
