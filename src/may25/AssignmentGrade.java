package may25;

import java.util.Scanner;

public class AssignmentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the Score");

        int num = sc.nextInt();

        if(num>=90){
            System.out.println("You got grade A");
        } else if (num>=80 && num <90) {
            System.out.println("You got a grade B");
        } else if (num>=70 && num <80) {
            System.out.println("You got a grade C");
        } else if (num>=60 && num <70) {
            System.out.println("You got a grade D");

        }else{
            System.out.println("Sorry!! You failed");
        }
    }
}
