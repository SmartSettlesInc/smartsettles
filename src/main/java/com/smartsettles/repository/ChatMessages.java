package com.smartsettles.repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by SantoshKompally on 3/6/17.
 */


@Document(collection = "chatMessages")
public class ChatMessages {

    @Id
    private String id;
    private String from;
    private String message;
    private String to;
    private Date date;
    private String type;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {

        this.date = new Date();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ChatMessages{" +
                "id='" + id + '\'' +
                ", from='" + from + '\'' +
                ", message='" + message + '\'' +
                ", to='" + to + '\'' +
                ", date=" + date +
                ", type='" + type + '\'' +
                '}';
    }
}
