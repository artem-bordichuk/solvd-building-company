package com.solvd.building.company.employee;

import java.util.Objects;

public class HeadBuilder extends Builder {
    private int maxTeamSize;
    private int professionalRate; //enum

    public HeadBuilder() {
    }

    public HeadBuilder(String firstName, String secondName, String homeTown,
                       String dateOfBirth, String dateOfHiring, String dateOfDismissal,
                       String insuranceNumber, String phoneNumber, String mail,
                       int experience, int salaryPerHour, int limitWorkingHoursPerWeek, int maxTeamSize) {
        super(firstName, secondName, homeTown, dateOfBirth, dateOfHiring, dateOfDismissal,
                insuranceNumber, phoneNumber, mail, experience, salaryPerHour, limitWorkingHoursPerWeek);
        this.maxTeamSize = maxTeamSize;
        this.professionalRate = professionalRate;
    }

    public int getMaxTeamSize() {
        return maxTeamSize;
    }

    public void setMaxTeamSize(int maxTeamSize) {
        this.maxTeamSize = maxTeamSize;
    }

    public int getProfessionalRate() {
        return professionalRate;
    }

    public void setProfessionalRate(int professionalRate) {
        this.professionalRate = professionalRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeadBuilder that = (HeadBuilder) o;
        return maxTeamSize == that.maxTeamSize && professionalRate == that.professionalRate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxTeamSize, professionalRate);
    }
}
