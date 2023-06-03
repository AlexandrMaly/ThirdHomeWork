package vehicle;

public abstract class GroundVehicle extends Vehicle {
    private int wheels;
    private String color;

    public GroundVehicle(String name, int speed, int wheels, String color) {
        super(name, speed);
        this.wheels = wheels;
        this.color = color;
    }

    public abstract void showWheels();

    public abstract void showColor();

    public int getWheels() {
        return wheels;
    }


    public String getColor() {
        return color;
    }

}
