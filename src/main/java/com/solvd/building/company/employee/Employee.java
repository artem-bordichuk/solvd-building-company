package com.solvd.building.company.employee;

import java.util.Objects;

public class Employee extends Person {
    private String homeTown;
    private String dateOfBirth;
    private String dateOfHiring;
    private String dateOfDismissal;
    private String insuranceNumber;
    private String phoneNumber;
    private String mail;

    public Employee() {
    }

    public Employee(String firstName, String secondName, String homeTown,
                    String dateOfBirth, String dateOfHiring, String dateOfDismissal,
                    String insuranceNumber, String phoneNumber, String mail) {
        super(firstName, secondName);
        this.homeTown = homeTown;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHiring = dateOfHiring;
        this.dateOfDismissal = dateOfDismissal;
        this.insuranceNumber = insuranceNumber;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(String dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public String getDateOfDismissal() {
        return dateOfDismissal;
    }

    public void setDateOfDismissal(String dateOfDismissal) {
        this.dateOfDismissal = dateOfDismissal;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(homeTown, employee.homeTown)
                && Objects.equals(dateOfBirth, employee.dateOfBirth)
                && Objects.equals(dateOfHiring, employee.dateOfHiring)
                && Objects.equals(dateOfDismissal, employee.dateOfDismissal)
                && Objects.equals(insuranceNumber, employee.insuranceNumber)
                && Objects.equals(phoneNumber, employee.phoneNumber)
                && Objects.equals(mail, employee.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeTown, dateOfBirth, dateOfHiring, dateOfDismissal, insuranceNumber, phoneNumber, mail);
    }
}
