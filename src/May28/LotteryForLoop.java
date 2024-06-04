package May28;

import java.util.Scanner;

public class LotteryForLoop {
    public static void main(String[] args) {
        System.out.println("You have 3 chances");

        for(int i=1;i<=3;i++){




            System.out.println("Enter your draw number between 1 and 100");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            int luckyNum = 33;
            if (luckyNum!=choice && luckyNum<100){

                System.out.println("Sorry you lost");
                continue;
            } else if (luckyNum==choice) {
                System.out.println("You've won the lottery");
                continue;

            } else if (luckyNum>100) {

                System.out.println("Enter a valid number");
                break;

            }


        }
    }
}
