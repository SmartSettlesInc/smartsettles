package com.smartsettles.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by SantoshKompally on 3/6/17.
 */
@Repository
public class InternetDetails {

    String internetProvider;
    List<ChatMessages> chatMessages;

    public String getInternetProvider() {
        return internetProvider;
    }

    public void setInternetProvider(String internetProvider) {
        this.internetProvider = internetProvider;
    }

    public List<ChatMessages> getChatMessages() {
        return chatMessages;
    }

    public void setChatMessages(List<ChatMessages> chatMessages) {
        this.chatMessages = chatMessages;
    }

    @Override
    public String toString() {
        return "InternetDetails{" +
                "internetProvider='" + internetProvider + '\'' +
                ", chatMessages=" + chatMessages +
                '}';
    }
}
