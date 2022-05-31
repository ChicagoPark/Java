package SubMain;

public class InterfaceDemo {

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 1, 10);
        System.out.println("Gear is: "+ mountainBike.getGear());
        System.out.println("Seat height is: "+ mountainBike.getSeatHeight());
        System.out.println("Bike speed is: "+ mountainBike.getSpeed());

        mountainBike.applyBrake(1);
        System.out.println("Bike speed after applying brake is: " + mountainBike.getSpeed());

        mountainBike.speedUp(10);
        System.out.println("Bike new speed after increment is: " + mountainBike.getSpeed());

    }
}
