package may25;

import java.util.Scanner;

public class SwitchCaseDemoString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a country to see its capital");

        String capital = sc.next();

        switch (capital){
            case "Canada":
                //capital for canada
                System.out.println("Capital for Canada is Ottawa");
                break;

            case "England":
                System.out.println("Capital for England is London");
                break;

            case "USA":
                System.out.println("Capital for USA is Washington");
                break;

            case "India":
                System.out.println("Capital for India is Delhi");
                break;

            default:
                System.out.println("See google for the rest :D");

        }
    }
}
