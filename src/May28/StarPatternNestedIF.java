package May28;

import java.util.Scanner;

public class StarPatternNestedIF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i,j, row = 6;

        //i will denote row and j will do column
        //row denotes number of row we want to print

        //outer loop for row
        for (i = 0; i < row; i++){
            //Inner loop for column
            for(j = 0; j < i; j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
