package May28;

import java.util.Scanner;

//lottery system
//1-100 ,
//when user enter a number
//compare the user number and lucky number
//you won the lottery
//try again, 3 chance
public class LotterySystem {
    public static void main(String[] args) {

        int luckynum = 44;

        int chance =3;

        do{
            System.out.println("You have "+chance+" chances left");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int userInput = sc.nextInt();
            if(userInput==luckynum){
                System.out.println("Congratulation you've won");
                break;
            }else {
                System.out.println("Sorry you did not win");
                chance--;
            }
        }while (chance!=0);

//        char c;
//        do {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter your number: ");
//            int entNum = sc.nextInt();
//            int luckyNum = 54;
//
//                if (entNum == luckyNum) {
//                    System.out.println("you won the lottery");
//                } else {
//                    System.out.println("Try again");
//                for (){
//
//                }}
//                System.out.println("Do you want to try again? (Y/N)");
//                c = sc.next().charAt(0);
//
//
//
//
//        } while (c == 'y' || c == 'Y') ;
    }
}


