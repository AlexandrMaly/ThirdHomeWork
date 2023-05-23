package ministryOfDefense;

public final class SpecialForce extends MinistryOfDefence {

    private String unit;
    private int howManyPeople;

    public void showUnitAndPeople(String unit, int howManyPeople) {
        this.unit = unit;
        this.howManyPeople = howManyPeople;
        System.out.println(unit + "have " + howManyPeople + " people");
    }

}
