package com.solvd.building.company;

import java.util.Objects;

public abstract class BuildingCompany {
    private String companyName;
    private String address;
    private String estDate;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEstDate() {
        return estDate;
    }

    public void setEstDate(String estDate) {
        this.estDate = estDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildingCompany that = (BuildingCompany) o;
        return Objects.equals(companyName, that.companyName)
                && Objects.equals(address, that.address)
                && Objects.equals(estDate, that.estDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, address, estDate);
    }
}
