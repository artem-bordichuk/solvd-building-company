package com.solvd.building.company;

import com.solvd.building.company.employee.Employee;
import com.solvd.building.company.equipment.Machine;
import com.solvd.building.company.equipment.Material;

import java.util.Arrays;
import java.util.Objects;

public class Budget {
    private Material[] materials;
    private Machine[] machines;
    private Employee[] employees; //Change to list
    private double projectCost;

    public Budget() {
    }

    public Budget(Material[] materials, Machine[] machines, Employee[] employees, double projectCost) {
        this.materials = materials;
        this.machines = machines;
        this.employees = employees;
        this.projectCost = projectCost;
    }

    public Material[] getMaterials() {
        return materials;
    }

    public void setMaterials(Material[] materials) {
        this.materials = materials;
    }

    public Machine[] getMachines() {
        return machines;
    }

    public void setMachines(Machine[] machines) {
        this.machines = machines;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public double getProjectCost() {
        return projectCost;
    }

    public void setProjectCost(double projectCost) {
        this.projectCost = projectCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Budget budget = (Budget) o;
        return Double.compare(budget.projectCost, projectCost) == 0
                && Arrays.equals(materials, budget.materials)
                && Arrays.equals(machines, budget.machines)
                && Arrays.equals(employees, budget.employees);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(projectCost);
        result = 31 * result + Arrays.hashCode(materials);
        result = 31 * result + Arrays.hashCode(machines);
        result = 31 * result + Arrays.hashCode(employees);
        return result;
    }
}
