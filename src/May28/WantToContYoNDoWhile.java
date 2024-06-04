package May28;
//do you want to continue
//write a program to display table of any number
import java.util.Scanner;

public class WantToContYoNDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char Choice;
        do {
            int i, t;

            System.out.println("Enter table number");

            t=sc.nextInt();

            i=1;
            while (i<=10){
                System.out.println(i+"*"+t+"="+i*t);
                i++;
            }
            System.out.println("Do you want to Continue? (Y/N): ");
            Choice=sc.next().charAt(0);
        }while (Choice=='y'||Choice=='Y');
        sc.close();



    }
}
