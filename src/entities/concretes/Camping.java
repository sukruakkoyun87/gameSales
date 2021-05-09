package entities.concretes;

import entities.abstracts.Entity;

public class Camping implements Entity {

    private String CampingName;
    private double discountRate;

    public Camping(String campingName, double discountRate) {
        CampingName = campingName;
        this.discountRate = discountRate;
    }

    public String getCampingName() {
        return CampingName;
    }

    public void setCampingName(String campingName) {
        CampingName = campingName;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
