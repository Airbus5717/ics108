package com.airbus5717.lab8;

import java.util.Date;

public class Graduate extends Student {

    public Graduate(int id, String name, Date birthDate, double gpa) {
        super(id, name, birthDate, gpa);
    }

    @Override
    public String toString() {
        return "graduate" +  super.toString() + " ,Status: " + getStatus() + " }";
    }

    @Override
    public String getStatus() {
        if (super.getGpa() >= 3.0) {
            return "honor";
        } else if (super.getGpa() >= 2.0) {
            return "good";
        } else {
            return "probation";
        }
    }

}
