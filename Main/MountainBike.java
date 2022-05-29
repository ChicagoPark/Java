package Main;

import Abstract.GraphicObject;

public class MountainBike extends Bicycle {
    public int seatHeight;
    public MountainBike(int startHeight, int startSpeed, int startGear) {
        super(startSpeed, startGear); // Use super statement as the first statement of initializer
        this.seatHeight = startHeight;
    }
    public void setHeight(int newValue){
        this.seatHeight = newValue;
    }
}
