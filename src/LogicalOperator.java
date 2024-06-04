public class LogicalOperator {
    public static void main(String[] args){


        int x = 30;
        int y = 20;
        int a = 15;
        int b = 25;


        //or operator
        boolean result = (x<y) || (x>a);


        //AND operator
        System.out.println(result);

        boolean result1 = (x<y) && (x>a);

        System.out.println(result1);


        //NOR operator
        boolean result2 = !((x<y) && (x>a));

        System.out.println(result2);






    }
}
