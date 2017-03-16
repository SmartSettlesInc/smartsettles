package com.smartsettles.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SantoshKompally on 3/5/17.
 */

@Repository
public class ApartmentDetails {

    String name;
    Address apartmentAddress;
    List<ChatMessages> chatMessages;

    public ApartmentDetails() {
    }

    public ApartmentDetails(String name, Address apartmentAddress, List<ChatMessages> chatMessages) {
        this.name = name;
        this.apartmentAddress = apartmentAddress;
        this.chatMessages = chatMessages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "name='" + name + '\'' +
                ", apartmentAddress=" + apartmentAddress +
                ", chatMessages=" + chatMessages +
                '}';
    }
}
