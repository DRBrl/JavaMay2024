package may25;

import java.util.Scanner;

public class AssignmentLeapYear {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the year");

            boolean leapYear;

            int year = sc.nextInt();
                // divisible by 4
            leapYear = (year % 4 == 0);

                // divisible by 4, not by 100, or divisible by 400
            leapYear = leapYear && (year % 100 != 0 || year % 400 == 0);

                if (leapYear) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            }
        }
