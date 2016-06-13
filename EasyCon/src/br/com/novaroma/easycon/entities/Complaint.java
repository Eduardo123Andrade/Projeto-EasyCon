
package br.com.novaroma.easycon.entities;

import java.io.Serializable;
import java.util.Date;

public class Complaint extends Entity implements Serializable {

    private int complaintCode;
    private String category;
    private String title;
    private String text;
    private Date date;
    private Resident resident;
    private String status;
    private boolean solved;
    
    @Override
    public String getId() {
        return String.valueOf(getComplaintCode());
    }

    public Complaint() {
    }

    public Complaint(int complaintCode, String category, String title, String text, Resident resident) {
        this.complaintCode = complaintCode;
        this.category = category;
        this.title = title;
        this.text = text;
        this.date = new Date();
        this.resident = resident;
        this.status = "Nao resolvido";
        this.solved = false;
    }

    public int getComplaintCode() {
        return complaintCode;
    }

    public void setComplaintCode(int complaintCode) {
        this.complaintCode = complaintCode;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
