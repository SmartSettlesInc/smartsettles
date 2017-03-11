package com.smartsettles.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SantoshKompally on 3/5/17.
 */

@Repository
public class ApartmentDetails {

    String apartmentName;
    Address apartmentAddress;
    List<ChatMessages> chatMessages;

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public Address getApartmentAddress() {
        return apartmentAddress;
    }

    public void setApartmentAddress(Address apartmentAddress) {
        this.apartmentAddress = apartmentAddress;
    }

    public List<ChatMessages> getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(List<ChatMessages> chatMessages) {
        this.chatMessages = chatMessages;
    }

    @Override
    public String toString() {
        return "ApartmentDetails{" +
                "apartmentName='" + apartmentName + '\'' +
                ", apartmentAddress=" + apartmentAddress +
                ", chatMessages=" + chatMessages +
                '}';
    }
}
