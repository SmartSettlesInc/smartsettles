package com.smartsettles.repository;

/**
 * Created by SantoshKompally on 3/14/17.
 */

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ElectricityDetails {


    String name;
    List<ChatMessages> chatMessages;

    public ElectricityDetails() {
    }

    public ElectricityDetails(String name, List<ChatMessages> chatMessages) {
        this.name = name;
        this.chatMessages = chatMessages;
    }

    public List<ChatMessages> getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(List<ChatMessages> chatMessages) {
        this.chatMessages = chatMessages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ElectricityDetails{" +
                "name='" + name + '\'' +
                ", chatMessages=" + chatMessages +
                '}';
    }
}
