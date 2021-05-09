package entities.concretes;

import entities.abstracts.Entity;

public class Player implements Entity {

    private  int id;
    private String fisrtName;
    private  String lastName;
    private int birtDateYear;
    private  String  nationalityId;

    public Player(int id, String fisrtName, String lastName, int birtDateYear, String nationalityId) {
        this.id = id;
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.birtDateYear = birtDateYear;
        this.nationalityId = nationalityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirtDateYear() {
        return birtDateYear;
    }

    public void setBirtDateYear(int birtDateYear) {
        this.birtDateYear = birtDateYear;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }



}
