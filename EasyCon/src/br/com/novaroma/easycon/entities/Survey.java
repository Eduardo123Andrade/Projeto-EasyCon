
package br.com.novaroma.easycon.entities;

import java.io.Serializable;

public class Survey extends Entity implements Serializable{
   
    private int surveyCode;
    private String question;
    private double[] alternative;
    private int total;

     @Override
    public String getId() {
        return String.valueOf(surveyCode);
    }
    
    public Survey() {
        
    }

    public Survey(String question, int surveyCode) {
        this.surveyCode = surveyCode;
        this.question = question;
        alternative = new double[5];
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public double[] getAlternative() {
        return alternative;
    }

    public void setAlternative(int position) {
        alternative[position]++;
    }  
    
    public double getAlternative(int position) {
        return alternative[position];
    } 
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    public double[] returnPercent() {
        
        double[] percents = new double[alternative.length];
        
        for (int i = 0; i < percents.length; i++) {
            percents[i] = (alternative[i] * 100) / total;
        }
        
        return percents;
    }
}
