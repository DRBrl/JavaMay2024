package Assignment;

import java.util.Scanner;

public class IfElseGreater {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();

        //result = num>num1;

        if(num>num1){
            System.out.println(+num+ " is greater");
        }else{
            System.out.println(+num1+ " is greater");
        }
    }
}
