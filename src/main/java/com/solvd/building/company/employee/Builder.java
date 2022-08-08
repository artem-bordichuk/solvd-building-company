package com.solvd.building.company.employee;

import java.util.Objects;

public class Builder extends Employee {
    private int experience;
    private int salaryPerHour;
    private int limitWorkingHoursPerWeek;

    public Builder() {
    }

    public Builder(String firstName, String secondName,
                   String homeTown, String dateOfBirth,
                   String dateOfHiring, String dateOfDismissal,
                   String insuranceNumber, String phoneNumber, String mail,
                   int experience, int salaryPerHour, int limitWorkingHoursPerWeek) {
        super(firstName, secondName, homeTown, dateOfBirth, dateOfHiring, dateOfDismissal, insuranceNumber, phoneNumber, mail);
        this.experience = experience;
        this.salaryPerHour = salaryPerHour;
        this.limitWorkingHoursPerWeek = limitWorkingHoursPerWeek;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public int getLimitWorkingHoursPerWeek() {
        return limitWorkingHoursPerWeek;
    }

    public void setLimitWorkingHoursPerWeek(int limitWorkingHoursPerWeek) {
        this.limitWorkingHoursPerWeek = limitWorkingHoursPerWeek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Builder builder = (Builder) o;
        return experience == builder.experience
                && salaryPerHour == builder.salaryPerHour
                && limitWorkingHoursPerWeek == builder.limitWorkingHoursPerWeek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experience, salaryPerHour, limitWorkingHoursPerWeek);
    }
}
