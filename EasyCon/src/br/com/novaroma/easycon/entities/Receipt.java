
package br.com.novaroma.easycon.entities;

import java.io.Serializable;
import java.util.Date;

public class Receipt extends Entity implements Serializable{
    
    private int codeReceipt;
    private Resident resident;
    private String description;
    private double value;
    private Date date;
    private boolean paid;

    @Override
    public String getId() {
        return String.valueOf(getCodeReceipt());
    }
    
    public Receipt() {
        
    }

    public Receipt(int codeReceipt, Resident resident, String description, double value) {
        this.codeReceipt = codeReceipt;
        this.resident = resident;
        this.description = description;
        this.value = value;
        this.date = new Date();
        this.paid = false;
    }

    public int getCodeReceipt() {
        return codeReceipt;
    }

    public void setCodeReceipt(int codeReceipt) {
        this.codeReceipt = codeReceipt;
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
