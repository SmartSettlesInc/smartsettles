package com.smartsettles.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SantoshKompally on 3/5/17.
 */

@Repository
public class LeasingChat extends Chat{

    List<ApartmentDetails> apartmentDetails;

    public List<ApartmentDetails> getApartmentDetails() {
        return apartmentDetails;
    }

    public void setApartmentDetails(List<ApartmentDetails> apartmentDetails) {
        this.apartmentDetails = apartmentDetails;
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public String toString() {
        return "LeasingChat{" +
                "apartmentDetails=" + apartmentDetails +
                '}';
    }
}

