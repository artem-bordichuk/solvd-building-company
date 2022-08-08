package com.solvd.building.company.order;

import com.solvd.building.company.Budget;
import com.solvd.building.company.BuildingCompany;
import com.solvd.building.company.employee.Client;
import com.solvd.building.company.enums.TypeOfProjects;

import java.util.Objects;

public class Project extends Order {
    private BuildingCompany info;
    private Budget projectBudget;
    private String projectDeadline;

    public Project() {
    }

    public Project(Client client, TypeOfProjects projectType, String orderDate,
                   String desiredDuration, BuildingCompany info,
                   Budget projectBudget, String projectDeadline) {
        super(client, projectType, orderDate, desiredDuration);
        this.info = info;
        this.projectBudget = projectBudget;
        this.projectDeadline = projectDeadline;
    }

    public BuildingCompany getInfo() {
        return info;
    }

    public void setInfo(BuildingCompany info) {
        this.info = info;
    }

    public Budget getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(Budget projectBudget) {
        this.projectBudget = projectBudget;
    }

    public String getProjectDeadline() {
        return projectDeadline;
    }

    public void setProjectDeadline(String projectDeadline) {
        this.projectDeadline = projectDeadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(info, project.info)
                && Objects.equals(projectBudget, project.projectBudget)
                && Objects.equals(projectDeadline, project.projectDeadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(info, projectBudget, projectDeadline);
    }
}
