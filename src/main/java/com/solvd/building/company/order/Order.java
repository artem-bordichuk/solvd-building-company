package com.solvd.building.company.order;

import com.solvd.building.company.employee.CivilEnginner;
import com.solvd.building.company.employee.Client;
import com.solvd.building.company.employee.ProjectManager;
import com.solvd.building.company.enums.TypeOfProjects;

import java.util.Objects;

public class Order {
    private Client client;
    private TypeOfProjects projectType;
    private String orderDate;
    private String desiredDuration; // Maybe here is better to use Enum
    private ProjectManager projectManager;
    private CivilEnginner civilEnginner;

    public Order() {
    }

    public Order(Client client, TypeOfProjects projectType, String orderDate, String desiredDuration) {
        this.client = client;
        this.projectType = projectType;
        this.orderDate = orderDate;
        this.desiredDuration = desiredDuration;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public TypeOfProjects getProjectType() {
        return projectType;
    }

    public void setProjectType(TypeOfProjects projectType) {
        this.projectType = projectType;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDesiredDuration() {
        return desiredDuration;
    }

    public void setDesiredDuration(String desiredDuration) {
        this.desiredDuration = desiredDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(client, order.client)
                && projectType == order.projectType
                && Objects.equals(orderDate, order.orderDate)
                && Objects.equals(desiredDuration, order.desiredDuration)
                && Objects.equals(projectManager, order.projectManager)
                && Objects.equals(civilEnginner, order.civilEnginner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, projectType, orderDate, desiredDuration, projectManager, civilEnginner);
    }
}
