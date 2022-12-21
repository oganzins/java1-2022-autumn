package lv.javaguru.training.lesson08.inheritance;

public class MountainBicycle extends Bicycle {

    private int gear;

    public MountainBicycle(String brand, int speed, int gear) {
        super(brand, speed);
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public void changeGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void accelerate() {
        int newSpeed = getSpeed() + gear;
        setSpeed(newSpeed);
    }

    @Override
    public String toString() {
        return "MountainBicycle{" +
                "gear=" + gear +
                "} " + super.toString();
    }
}
