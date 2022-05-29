package SubMain;

public class MountainBike implements Bicycle{
    private int seatHeight;
    private int gear;
    private int speed;

    public MountainBike(int seatHeight,int gear, int speed){
        this.seatHeight = seatHeight;
        this.gear = gear;
        this.speed = speed;
    }

    @Override
    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        this.speed += increment;
    }

    public int getSeatHeight() {
        return this.seatHeight;
    }
    public int getGear() {
        return this.gear;
    }
    public int getSpeed() {
        return this.speed;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
