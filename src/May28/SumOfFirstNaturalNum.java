package May28;

import java.util.Scanner;

public class SumOfFirstNaturalNum {

    public static void main(String[] args) {

        int num = 1;

        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int n = sc.nextInt();

        do{
            sum=sum+num;
            num++;
        }while (num<=n);
        System.out.println(sum);
    }
}
