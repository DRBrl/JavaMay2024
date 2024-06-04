package May28;

public class BreakContinueDemo {
    public static void main(String[] args) {


        int x = 0;

        do {
            System.out.println(x);
            if (x % 4 == 0 && x > 5){
            break;
        }
            x++;
        }while(x<=100);
    }
}
