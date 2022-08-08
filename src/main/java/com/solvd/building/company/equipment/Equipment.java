package com.solvd.building.company.equipment;

import com.solvd.building.company.enums.ManufatureCountry;

import java.util.Objects;

public abstract class Equipment {
    private double cost;
    private ManufatureCountry country;

    public Equipment() {
    }

    public Equipment(double cost, ManufatureCountry country) {
        this.cost = cost;
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public ManufatureCountry getCountry() {
        return country;
    }

    public void setCountry(ManufatureCountry country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return Double.compare(equipment.cost, cost) == 0 && country == equipment.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, country);
    }
}

