package com.smartsettles.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by SantoshKompally on 3/6/17.
 */

@Repository
public class ChatInput {

    String type;
    String userId;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ChatInput{" +
                "type='" + type + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
