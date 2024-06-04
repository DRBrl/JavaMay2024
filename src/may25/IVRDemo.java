package may25;

import java.util.Scanner;

public class IVRDemo {
    public static void main(String[] args) {

        //press 1: english
        //telecom: billing, cancellation, tech support, customer
        //Billing: pay your bill, make a payment arrangment
        //press 2 : French

        System.out.println("Welcom to the telcommunication XYZ");

        System.out.println("Press 1 for english");
        System.out.println("Press 2 for french");

        Scanner sc=new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice){
            case 1:
            System.out.println("You've selected english");

            int moreChoice = 1;

            if(moreChoice==1){
                System.out.println("You've reached to Tech support");

                System.out.println("Do you want to talk with tech support or automatic response");

                System.out.println("Press 1 for tech support and 2 for automatic resopnse");

                int tech = sc.nextInt();

                if(tech==1){
                    System.out.println("Hello you've reached to tech support specialist");
                }else{
                    System.out.println("This is a automatic response");
                }


            }break;
            case 2:
                System.out.println("You've selected French");
                System.out.println("Please press 1 for customer service or 2 for billing department or 3 to exit");

                int choiceY=1;

                if(choiceY==1){
                    System.out.println("You've reached to customer service");

                    System.out.println("Press 1 to talk with agent and 2 for automatic response");

                    int tech1 = sc.nextInt();




                } else if (choiceY==2) {
                    System.out.println("You've reached to billing department");


                }else{
                    break;
                }
            {


                }
        }
    }
}
