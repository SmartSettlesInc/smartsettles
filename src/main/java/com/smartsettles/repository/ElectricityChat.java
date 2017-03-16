package com.smartsettles.repository;

import java.util.List;

/**
 * Created by SantoshKompally on 3/5/17.
 */
public class ElectricityChat extends Chat{

    List<ElectricityDetails> electricityDetails;

    public List<ElectricityDetails> getElectricityDetails() {
        return electricityDetails;
    }

    public void setElectricityDetails(List<ElectricityDetails> electricityDetailsList) {
        this.electricityDetails = electricityDetailsList;
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }
}
