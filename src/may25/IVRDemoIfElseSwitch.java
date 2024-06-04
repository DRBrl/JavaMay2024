package may25;

import java.util.Scanner;

public class IVRDemoIfElseSwitch {
    public static void main(String[] args){



        Scanner scanner =new Scanner(System.in);
        char option12 = 'y';

        do {
            System.out.println("Press 1 for english");
            System.out.println("Press 2 for french");

            int choice = scanner.nextInt();

            if (choice == 1) {

                System.out.println("You've selected English \n");

                System.out.println("See the following options");
                System.out.println("Press 1 for billing");
                System.out.println("Press 2 for support");
                System.out.println("Press 3 for new user");
                System.out.println("Press 4 for career options");
                System.out.println("Press 5 for customer service");
                System.out.println("Press 6 to exit");


                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Hello! You've reached billing department \n");

                        System.out.println("Press 1 to see your outstanding balance");
                        System.out.println("Press 2 to see your payment deadline");
                        System.out.println("Press any number to see if your payment is approved");

                        int bill = scanner.nextInt();

                        if (bill == 1) {
                            System.out.println("your outstanding balance is.......");
                        } else if (bill == 2) {
                            System.out.println("your deadline for payment is......");

                        } else {
                            System.out.println("your payment has not been updated to system");
                        }
                    {
                        System.out.println("");
                    }
                    break;

                    case 2:
                        System.out.println("Hello! You've reached support");

                        System.out.println("Press 1 for automated chat for support");
                        System.out.println("Press 2 for talk with technician");
                        System.out.println("Press 3 to exit");

                        int support = scanner.nextInt();

                        if (support == 1) {
                            System.out.println("You've reached to automated chat support");
                        } else if (support == 2) {
                            System.out.println("You've selected to talk with technician, stay in hold");

                        } else {
                            System.out.println("Chat terminated by user");
                        }
                        break;

                    case 3:
                        System.out.println("Hello! You've reached new user dept \n");

                        System.out.println("Press 1 for new user");
                        System.out.println("Press 2 for returning user");
                        System.out.println("Press 3 to terminate");

                        int nUser = scanner.nextInt();

                        if (nUser == 1) {
                            System.out.println("Welcome to XYZ company\n");
                            System.out.println("Please select 1 for plans");
                            System.out.println("Please select 2 for services");
                            System.out.println("please select 3 to exit");

                            int nUserPlan = scanner.nextInt();
//                        if(nUserPlan==1){
//                            System.out.println("5GB at $30/month");
//                            System.out.println("10GB at $45/month");
//                            System.out.println("Unlimited for $60/month");
//                        } else if (nUserPlan==2) {
//                            System.out.println("1 month service $30/month");
//                            System.out.println("6 month service $45/month");
//                            System.out.println("2 year service $60/month");
//
//                        }else{
//                            System.out.println("thank you! Visit soon");
//                            break;
                            switch (nUserPlan) {
                                case 1:
                                    System.out.println("5GB at $30/month");
                                    System.out.println("10GB at $45/month");
                                    System.out.println("Unlimited for $60/month");
                                    break;

                                case 2:
                                    System.out.println("1 month service $30/month");
                                    System.out.println("6 month service $45/month");
                                    System.out.println("2 year service $60/month");
                                    break;

                                case 3:
                                    System.out.println("Thank you, visit soon");
                                    break;
                            }
                        } else if (nUser == 2) {
                            System.out.println("hello returning user");


                        } else {
                            System.out.println("exit");
                            break;
                        }


                        break;

                    case 4:
                        System.out.println("Hello! You've reached career department");
                        break;

                    case 5:
                        System.out.println("Hello! You've reached customer care department");
                        break;

                    case 6:
                        System.out.println("Good bye!!");
                        break;
                }
            } else {
                System.out.println("You've selected French");

            }
            System.out.println("Do you want to continye? (Y/N): ");
            scanner.next().charAt(0);
        }while (option12 =='y'||option12=='Y');
        scanner.close();

    }
}
