
package br.com.novaroma.easycon.entities;

import java.io.Serializable;
import java.util.Date;

public class Vote extends Entity implements Serializable{
    
    private int voteCode;
    private Survey survey;
    private Resident resident;
    private int alternative;
    private Date date;
   
    @Override
    public String getId() {
        return String.valueOf(getVoteCode());
    }
    
    public Vote() {
        
    }
    
    public Vote(Survey survey, Resident resident, int alternative) {
        this.voteCode = survey.getSurveyCode() * 10;
        this.survey = survey;
        this.resident = resident;
        this.alternative = alternative;
        this.date = new Date();
    }
    
    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getVoteCode() {
        return voteCode;
    }

    public void setVoteCode(int voteCode) {
        this.voteCode = voteCode;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public int getAlternative() {
        return alternative;
    }

    public void setAlternative(int alternative) {
        this.alternative = alternative;
    }
}
