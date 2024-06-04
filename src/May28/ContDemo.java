package May28;

public class ContDemo {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){

            if(i % 2 == 0)continue;
            System.out.println(i);
        }
    }
}

//print number from 1-100
//after 20, it should only print odd numbers

//1,2,3,4,5,6,7............20 21 23 25 27.......99