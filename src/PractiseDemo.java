public class PractiseDemo {
    public static void main(String[] args){

        System.out.println("Current value of x and y");

        int x = 10;
        int y = 20;
        int z;

        System.out.println("x : " +x);
        System.out.println("y : " +y);

        System.out.println("Changed value of x and y");
        /*
        //change to x = 20 and y = 10;

         x = 20;
         y = 10;

         */

        /*
        //Assign temp
        temp=x; //temp stores x value
        x=y; //x holds y value
        y=temp; //y holds temp values
         */

        //or assign 3rd variable -- swap

        /*
        //Without assigning third operator
        x = x + y; //x=30
        y = x - y; //y= 10
        x = x - y; //x=20


         */

        z = x; // z=10
        x=y; // x= 20
        y=z; // y=10

        System.out.println("After Swapping");

        System.out.println("x : "+x);
        System.out.println("y : "+y);

    }
}
