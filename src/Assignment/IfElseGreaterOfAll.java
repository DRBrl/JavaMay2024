package Assignment;

import java.util.Scanner;

public class IfElseGreaterOfAll {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter three numbers");
        int fNum = scanner.nextInt();
        int sNum = scanner.nextInt();
        int tNum = scanner.nextInt();

        if(fNum>=sNum && fNum>=tNum){
            System.out.println(+fNum+ " is the greatest");
        }else if (sNum>=fNum && sNum>=tNum){
            System.out.println(+sNum+ " is the greatest");
        }else{
            System.out.println(+tNum+ " is the greatest");
        }
    }
}
