package com.smartsettles.repository;

import java.util.Date;

/**
 * Created by SantoshKompally on 3/6/17.
 */
public class ChatMessages {

    private int id;
    private String from;
    private String message;
    private String to;
    private Date date;

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
        this.date = date;
    }

    @Override
    public String toString() {
        return "ChatMessages{" +
                "from='" + from + '\'' +
                ", message='" + message + '\'' +
                ", to='" + to + '\'' +
                ", date=" + date +
                '}';
    }
}
