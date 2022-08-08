package com.solvd.building.company.equipment;

import com.solvd.building.company.enums.MachineType;
import com.solvd.building.company.enums.ManufatureCountry;

import java.util.Objects;

public class Machine extends Equipment {
    private MachineType type;
    private String brandName;
    private int weight;
    private int costPerHour;

    public Machine() {
    }

    public Machine(double cost, ManufatureCountry country,
                   MachineType type, String brandName, int weight, int costPerHour) {
        super(cost, country);
        this.type = type;
        this.brandName = brandName;
        this.weight = weight;
        this.costPerHour = costPerHour;
    }

    public MachineType getType() {
        return type;
    }

    public void setType(MachineType type) {
        this.type = type;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(int costPerHour) {
        this.costPerHour = costPerHour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Machine machine = (Machine) o;
        return weight == machine.weight && costPerHour == machine.costPerHour && type == machine.type && Objects.equals(brandName, machine.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, brandName, weight, costPerHour);
    }
}
