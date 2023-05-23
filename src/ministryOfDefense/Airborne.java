package ministryOfDefense;

public final class Airborne extends MinistryOfDefence{
private String task;
private String vehicle;

public void showTaskAndVehicle(String task, String vehicle){
    this.task = task;
    this.vehicle = vehicle;
    System.out.println("we have "+ task + " task and use this " + vehicle + " vehicle");
}



}
