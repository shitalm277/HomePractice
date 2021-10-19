public class OverridingBike extends OverridingVehicle{
    //This is a child class
    //Defining the same method as in the parent class

    void run(){
    System.out.println("Bike is parked");
    }
    public static void main(String[]args){
    OverridingBike overridingbike = new OverridingBike();//Created the object
    overridingbike.run();
    }
}

