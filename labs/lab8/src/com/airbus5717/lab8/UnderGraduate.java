package com.airbus5717.lab8;

import java.util.Date;

public class UnderGraduate extends Student {

    public UnderGraduate(int id, String name, Date birthDay, double gpa) {
        super(id, name, birthDay, gpa);
    }

    @Override
    public String toString() {
        return "undergraduate" + super.toString() + " ,Status: " + getStatus() + " }";
    }

    @Override
    public String getStatus() {
        if (super.getGpa() >= 3.0) {
            return "good";
        } else {
            return "probation";
        }
    }

}
