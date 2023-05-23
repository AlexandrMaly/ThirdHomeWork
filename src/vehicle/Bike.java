package vehicle;

public final class Bike extends Ground {
    private int numberOfPassenger;
    private String typeOfBike;

    public Bike(String name, int speed, int wheels, String color) {
        super(name, speed, wheels, color);
    }

    public void showTypeAndPassenger(String type, int passenger) {
        this.typeOfBike = type;
        this.numberOfPassenger = passenger;
        System.out.println("This bike is " + typeOfBike + " and have " + numberOfPassenger + " seat");
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
        System.out.println("only road");
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
    public void ecoFriendly() {
        System.out.println("you make CO2");
    }

    @Override
    public void typeFuel() {
        System.out.println("Gasoline");
    }

    @Override
    public void consumption() {
        System.out.println("your consumption is 3l/100");
    }
}
