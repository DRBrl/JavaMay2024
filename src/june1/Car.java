package june1;

public class Car {


    //properties
    String color = "Blue";
    String brand = "Tesla";
    int engineSize = 1500;

    //
    void brake(){
        System.out.println("car is breaking");
    }
    void run(){
        System.out.println("car is running");
    }
    boolean hasElectricEngine(){

        return true;
    }
}
