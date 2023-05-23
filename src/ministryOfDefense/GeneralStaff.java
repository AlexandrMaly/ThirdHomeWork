package ministryOfDefense;

abstract public class GeneralStaff implements MinistryTwo {
    static int numberOfAlerts = 0;

    public abstract void notificationOfPersonnel(String whatNeed);

    @Override
    public void showWhenWeWin() {
        System.out.println("very soon");
    }

    @Override
    public void showWhenrusshaLoss() {
        System.out.println("is a near future");

    }

    @Override
    public void whenBeCheckBase() {

        System.out.println("every day and every night");
    }
}
