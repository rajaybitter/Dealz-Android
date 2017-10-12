package com.jm.jengo.dealz.classes;

/**
 * Created by rajay on 10/11/17.
 */

public class Message {
    private String sender;
    private String lastMessage;
    private String timeStamp;

    public Message(String sender, String lastMessage, String timeStamp) {
        this.sender = sender;
        this.lastMessage = lastMessage;
        this.timeStamp = timeStamp;
    }

    public Message() {

    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;

        Message message = (Message) o;

        return getSender().equals(message.getSender());

    }

    @Override
    public int hashCode() {
        return getSender().hashCode();
    }
}
