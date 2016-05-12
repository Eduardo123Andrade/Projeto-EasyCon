
package br.com.novaroma.easycon.entities;

import java.io.Serializable;
import java.util.Calendar;

public class Complaint extends Entity implements Serializable {

    private int complaintCode;
    private int urgency;
    private String category;
    private String text;
    private Calendar date;
    private Resident resident;
    private boolean solved;
    
    @Override
    public String getId() {
        return String.valueOf(getComplaintCode());
    }

    public Complaint() {
    }

    public Complaint(int complaintCode, int urgency, String category, String text, Calendar date, Resident resident, boolean solved) {
        this.complaintCode = complaintCode;
        this.urgency = urgency;
        this.category = category;
        this.text = text;
        this.date = date;
        this.resident = resident;
        this.solved = solved;
    }

    public int getComplaintCode() {
        return complaintCode;
    }

    public void setComplaintCode(int complaintCode) {
        this.complaintCode = complaintCode;
    }

    public int getUrgency() {
        return urgency;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }
}
