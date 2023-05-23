package ministryOfDefense;

public final class AirForce extends MinistryOfDefence {
private int howManyFlights;
private int howManyPlane;

public void HowManyFlightsAndPlane(int flights, int plane){
    if(flights <0){
        System.out.println("Flights can`t be minus");
    } else {
        this.howManyFlights += flights;
    }
    if(plane<0){
        System.out.println("Plane can`t be minus");
    } else {
        this.howManyPlane += plane;
    }

    System.out.println("We have " + howManyFlights + " flights and " + howManyPlane + " planes");
}

}
