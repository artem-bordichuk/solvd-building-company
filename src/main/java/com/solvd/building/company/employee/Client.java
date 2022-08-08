package com.solvd.building.company.employee;

import java.util.Objects;

public class Client extends Person {
    private String city;
    private String phone;

    public Client() {
    }

    public Client(String firstName, String secondName, String city, String phone) {
        super(firstName, secondName);
        this.city = city;
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(city, client.city) && Objects.equals(phone, client.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, phone);
    }
}
