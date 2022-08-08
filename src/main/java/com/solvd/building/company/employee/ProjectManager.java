package com.solvd.building.company.employee;

import com.solvd.building.company.enums.TypeOfProjects;

import java.util.Objects;

public class ProjectManager extends Employee {
    private TypeOfProjects projectSpecializations;
    private int professionalRate;
    private int experience;
    private int salaryPerHour;

    public ProjectManager() {
    }

    public ProjectManager(String firstName, String secondName, String homeTown,
                          String dateOfBirth, String dateOfHiring, String dateOfDismissal,
                          String insuranceNumber, String phoneNumber, String mail,
                          TypeOfProjects projectSpecializations, int professionalRate,
                          int experience, int salaryPerHour) {
        super(firstName, secondName, homeTown, dateOfBirth, dateOfHiring, dateOfDismissal,
                insuranceNumber, phoneNumber, mail);
        this.projectSpecializations = projectSpecializations;
        this.professionalRate = professionalRate;
        this.experience = experience;
        this.salaryPerHour = salaryPerHour;
    }

    public TypeOfProjects getProjectSpecializations() {
        return projectSpecializations;
    }

    public void setProjectSpecializations(TypeOfProjects projectSpecializations) {
        this.projectSpecializations = projectSpecializations;
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
        ProjectManager that = (ProjectManager) o;
        return professionalRate == that.professionalRate && experience == that.experience && salaryPerHour == that.salaryPerHour && projectSpecializations == that.projectSpecializations;
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectSpecializations, professionalRate, experience, salaryPerHour);
    }
}
