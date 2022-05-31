package Main;
import SubMain.Test;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 10 , 1);
        System.out.println("Gear is: "+ mountainBike.gear);
        System.out.println("Seat height is: "+ mountainBike.seatHeight);
        System.out.println("Bike speed is: "+ mountainBike.speed);

        mountainBike.applyBrake(1);
        System.out.println("Bike speed after applying brake is: " + mountainBike.speed);
    }
}
