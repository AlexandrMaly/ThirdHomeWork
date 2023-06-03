package ministryOfDefense;

import java.util.Scanner;

abstract public class MinistryOfDefence extends GeneralStaff {
    private int howUrgent;
    private String nameOfTheTLG;
    private String whenNeedToReturn;
    Scanner sc = new Scanner(System.in);

    @Override
    public void notificationOfPersonnel(String whatNeed) {
        numberOfAlerts++;
        nameOfTheTLG = whatNeed;
        System.out.println("Name of the TLG: " + nameOfTheTLG);
    }

    public void doSomePaperWork() {
        System.out.print("When need to return: ");
        whenNeedToReturn = sc.nextLine();
        System.out.println("choose from zero to two where:\n zero it`s - urgently \n one it`s - quickly \n two it`s - if possible");
        howUrgent = sc.nextInt();
        while (howUrgent < 0 || howUrgent > 2) {
            System.out.println("choose correct point");
            howUrgent = sc.nextInt();
        }
        if (howUrgent == 0) {
            System.out.println("Need to deliver urgently, need to return " + whenNeedToReturn);
        } else if (howUrgent == 1) {
            System.out.println("Need to deliver quickly, need to return " + whenNeedToReturn);
        } else if (howUrgent == 2) {
            System.out.println("Need to deliver if possible, need to return " + whenNeedToReturn);
        }
    }

    @Override
    public void showNumberOfAlerts() {
        System.out.println("we have: " + numberOfAlerts + " alert(s)");
    }

}
