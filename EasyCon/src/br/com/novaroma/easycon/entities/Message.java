
package br.com.novaroma.easycon.entities;

import java.io.Serializable;
import java.util.Date;

public class Message extends Entity implements Serializable {

    private Person sender;
    private Person receptor;
    private Date date;
    private int messageCode;
    private String title;
    private String text;
    
    @Override
    public String getId() {
        return String.valueOf(getMessageCode());
    }

    public Message() {
    }

    public Message(Person sender, Person receptor, Date date, int messageCode, String title, String text) {
        this.sender = sender;
        this.receptor = receptor;
        this.date = date;
        this.messageCode = messageCode;
        this.title = title;
        this.text = text;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(int messageCode) {
        this.messageCode = messageCode;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getReceptor() {
        return receptor;
    }

    public void setReceptor(Person receptor) {
        this.receptor = receptor;
    }
}
