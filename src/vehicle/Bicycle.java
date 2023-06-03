package vehicle;

public final class Bicycle extends GroundVehicle {

    private int passedKm;
    private double usedUpWater;


    public Bicycle(String name, int speed, int wheels, String color) {

        super(name, speed, wheels, color);
    }

    public double usedUpWater(int passedKm) {
        this.passedKm = passedKm;
        usedUpWater = getSpeed() / (passedKm * 100);
        return usedUpWater;
    }

    @Override
    public void showWheels() {

        System.out.println(getName() + " have " + getWheels() + " wheels");
    }

    @Override
    public void showColor() {

        System.out.println(getName() + " have " + getColor() + " color");
    }

    @Override
    public void move() {

        System.out.println(getName() + " move with speed " + getSpeed() + " km per hour");
    }

    @Override
    public void permeability() {
        System.out.println("can drive in forest");
    }

    @Override
    public void drivingOnIce() {
        System.out.println("can`t drive on ice road");
    }

    @Override
    public void availabilityOfSecurity() {
        System.out.println("you don`t have airbags");
    }

    @Override
    public boolean isEcoFriendly() {
        return true;
    }

    @Override
    public void ShowTypeOfFuel() {
        System.out.println("electric");
    }

    @Override
    public void consumption() {
        System.out.println("you don`t use fuel");
    }
}
