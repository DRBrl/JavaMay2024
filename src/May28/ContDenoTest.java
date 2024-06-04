package May28;
//print number from 1-100
//after 20, it should only print odd numbers

//1,2,3,4,5,6,7............20 21 23 25 27.......99
public class ContDenoTest {
    public static void main(String[] args) {
        int i;
        for (i=1;i<100;i++){
            if(i > 20 && i % 2 == 0)continue;
            System.out.println(i);
        }
    }
}
