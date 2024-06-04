package may25;

import java.util.Scanner;

public class CheckIFTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");

        int fNum = sc.nextInt();
        int sNum = sc.nextInt();
        int tNum = sc.nextInt();

        if(fNum==sNum && fNum==tNum&&sNum==tNum){
            System.out.println("It is equilateral");

        } else if (fNum==sNum || sNum==tNum || fNum==tNum ) {
            System.out.println("it is isosceles");

        } else  {
            System.out.println("it is scalene");
            
        }
    }
}
