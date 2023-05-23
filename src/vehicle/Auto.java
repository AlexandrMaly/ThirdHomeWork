package vehicle;

public final class Auto  extends Ground{

    private int kilometres;
    private int kilometresToTO;


    public Auto(String name, int speed, int wheels, String color) {
        super(name, speed, wheels, color);
    }

    public int showKmToTO(int passedKm, int kmToTO){
        this.kilometres=passedKm;
        this.kilometresToTO=kmToTO;
        return kilometresToTO-kilometres;
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
        System.out.println("vezdehod");
    }

    @Override
    public void drivingOnIce() {
        System.out.println("can drive on ice road");
    }

    @Override
    public void availabilityOfSecurity() {
        System.out.println("you have airbags");
    }

    @Override
    public void ecoFriendly() {
        System.out.println("you make CO2");
    }

    @Override
    public void typeFuel() {
        System.out.println("Dizel");
    }

    @Override
    public void consumption() {
          System.out.println("your consumption is 15l/100");
    }
}
