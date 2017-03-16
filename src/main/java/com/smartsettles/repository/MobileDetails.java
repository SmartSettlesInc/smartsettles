package com.smartsettles.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SantoshKompally on 3/14/17.
 */

@Repository
public class MobileDetails {


    String name;
    List<ChatMessages> chatMessages;

    public MobileDetails() {
    }

    public MobileDetails(String name, List<ChatMessages> chatMessages) {
        this.name = name;
        this.chatMessages = chatMessages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ChatMessages> getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(List<ChatMessages> chatMessages) {
        this.chatMessages = chatMessages;
    }

    @Override
    public String toString() {
        return "MobileDetails{" +
                "name='" + name + '\'' +
                ", chatMessages=" + chatMessages +
                '}';
    }
}


