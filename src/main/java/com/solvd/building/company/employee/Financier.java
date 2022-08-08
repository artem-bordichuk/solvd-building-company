package com.solvd.building.company.employee;

import java.util.Objects;

public class Financier extends Employee {
    private int professionalRate;
    private int experience;
    private int salaryPerHour;

    public Financier() {
    }

    public Financier(String firstName, String secondName, String homeTown,
                     String dateOfBirth, String dateOfHiring, String dateOfDismissal,
                     String insuranceNumber, String phoneNumber, String mail,
                     int professionalRate, int experience, int salaryPerHour) {
        super(firstName, secondName, homeTown, dateOfBirth, dateOfHiring,
                dateOfDismissal, insuranceNumber, phoneNumber, mail);
        this.professionalRate = professionalRate;
        this.experience = experience;
        this.salaryPerHour = salaryPerHour;
    }

    public int getProfessionalRate() {
        return professionalRate;
    }

    public void setProfessionalRate(int professionalRate) {
        this.professionalRate = professionalRate;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Financier financier = (Financier) o;
        return professionalRate == financier.professionalRate
                && experience == financier.experience
                && salaryPerHour == financier.salaryPerHour;
    }

    @Override
    public int hashCode() {
        return Objects.hash(professionalRate, experience, salaryPerHour);
    }
}
