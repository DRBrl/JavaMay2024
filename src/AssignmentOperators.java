public class AssignmentOperators {
    public static void main(String[] args){

//        int x = 10;
//        int sum = 0;
//
//        sum = sum + x; // can also be used as sum += x;

        int x = 10;
        int y = 20;

        System.out.println(x);
        System.out.println(y);

        //now lets assign something for y

        y= x+y;

        System.out.println(x);
        System.out.println(y); //this will print 30 as y stores the addition of x and y now.

    }
}
