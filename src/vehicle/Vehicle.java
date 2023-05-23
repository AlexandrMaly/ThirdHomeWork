package vehicle;

public abstract class Vehicle implements VehicleTwo, VehicleThree {
    private String name;
    private int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public abstract void move();


    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}

