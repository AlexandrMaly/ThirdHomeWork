import ministryOfDefense.AirForce;
import ministryOfDefense.Airborne;
import ministryOfDefense.GeneralStaff;
import ministryOfDefense.SpecialForce;
import vehicle.Auto;
import vehicle.Bicycle;
import vehicle.Bike;
import vehicle.GroundVehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n*************Special Force*****************\n");
        SpecialForce specialForce = new SpecialForce();
        specialForce.notificationOfPersonnel("TLG first");
        specialForce.doSomePaperWork();
        specialForce.showNumberOfAlerts();
        specialForce.showUnitAndPeople("SQB", 25);
        specialForce.whenBeCheckBase();
        specialForce.showWhenWeWin();
        specialForce.showWhenrusshaLoss();

        System.out.println("\n*************Air Force*****************\n");
        AirForce airForce = new AirForce();
        airForce.HowManyFlightsAndPlane(1, 2);
        airForce.HowManyFlightsAndPlane(-2, 4);
        airForce.notificationOfPersonnel("TLG second");
        airForce.doSomePaperWork();
        airForce.showNumberOfAlerts();
        airForce.showWhenWeWin();
        airForce.showWhenrusshaLoss();
        airForce.whenBeCheckBase();

        System.out.println("\n*************Airborne*****************\n");
        Airborne airborne = new Airborne();
        airborne.showTaskAndVehicle("ambush", "HMMWV");
        airborne.doSomePaperWork();
        airborne.notificationOfPersonnel("TLG third");
        airborne.showNumberOfAlerts();
        airborne.showWhenWeWin();
        airborne.showWhenrusshaLoss();
        airborne.whenBeCheckBase();

        System.out.println("\n*************Bicycle*****************\n");
        Bicycle bicycle = new Bicycle("velosiped", 50, 2, "yellow");
        bicycle.showWheels();
        bicycle.showColor();
        bicycle.move();
        bicycle.availabilityOfSecurity();
        bicycle.drivingOnIce();
        bicycle.isEcoFriendly();
        bicycle.ShowTypeOfFuel();
        bicycle.consumption();
        bicycle.permeability();
        bicycle.usedUpWater(25);

        System.out.println("\n*************Auto*****************\n");
        Auto auto = new Auto("Ford", 150,4,"grey");
        auto.showWheels();
        auto.showColor();
        auto.move();
        auto.availabilityOfSecurity();
        auto.consumption();
        auto.drivingOnIce();
        auto.isEcoFriendly();
        auto.permeability();
        auto.ShowTypeOfFuel();
        auto.showKmToTO(57,2000);

        System.out.println("\n*************Bike*****************\n");
        Bike bike = new Bike("Yamaha", 300, 2 , "green");
        bike.showWheels();
        bike.showColor();
        bike.move();
        bike.availabilityOfSecurity();
        bike.drivingOnIce();
        bike.isEcoFriendly();
        bike.ShowTypeOfFuel();
        bike.consumption();
        bike.permeability();
        bike.showTypeAndPassenger("sport", 1);

        System.out.println("\n******************************\n");
        GroundVehicle ground = new Auto("mazda", 90, 4, "white");
        ground.showWheels();
        ground.showColor();
        ground.move();
        ground.availabilityOfSecurity();
        ground.drivingOnIce();
        ground.isEcoFriendly();
        ground.ShowTypeOfFuel();
        ground.consumption();
        ground.permeability();

        System.out.println("\n******************************\n");
        GeneralStaff generalStaff = new SpecialForce();
        generalStaff.notificationOfPersonnel("TLG first");
        generalStaff.showNumberOfAlerts();
        generalStaff.whenBeCheckBase();
        generalStaff.showWhenWeWin();
        generalStaff.showWhenrusshaLoss();

    }
}