package com.solvd.building.company.equipment;

import com.solvd.building.company.enums.MachineType;
import com.solvd.building.company.enums.ManufatureCountry;

import java.util.Objects;

public class Material extends Equipment {
    private MachineType type;
    private double cost;

    public Material() {
    }

    public Material(double cost, ManufatureCountry country, MachineType type, int cost1) {
        super(cost, country);
        this.type = type;
        this.cost = cost1;
    }

    public MachineType getType() {
        return type;
    }

    public void setType(MachineType type) {
        this.type = type;
    }

    @Override
    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Material material = (Material) o;
        return Double.compare(material.cost, cost) == 0 && type == material.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, cost);
    }
}
