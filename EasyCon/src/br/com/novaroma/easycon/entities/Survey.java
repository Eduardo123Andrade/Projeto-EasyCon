package br.com.novaroma.easycon.entities;

import java.io.Serializable;
import java.util.Date;

public class Survey extends Entity implements Serializable {

    private int surveyCode;
    private String question;
    private String[] alternative;
    private double[] alternativeScore;
    private Date date;
    private int total;

    @Override
    public String getId() {
        return String.valueOf(getSurveyCode());
    }

    public Survey() {

    }

    public Survey(String question, int surveyCode, String[] alternative) {
        this.surveyCode = surveyCode;
        this.question = question;
        this.alternative = alternative;
        alternativeScore = new double[5];
        date = new Date();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public double[] getAlternativeScore() {
        return alternativeScore;
    }

    public void setAlternativeScore(int position) {
        alternativeScore[position]++;
        total++;
    }

    public double getAlternativeScore(int position) {
        return alternativeScore[position];
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSurveyCode() {
        return surveyCode;
    }

    public void setSurveyCode(int surveyCode) {
        this.surveyCode = surveyCode;
    }

    public String getAlternative(int index) {
        return alternative[index];
    }

    public void setAlternative(String[] alternative) {
        this.setAlternative(alternative);
    }

    public void setAlternativeScore(double[] alternativeScore) {
        this.alternativeScore = alternativeScore;
        
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double[] returnPercent() {

        double[] percents = new double[alternativeScore.length];

        for (int i = 0; i < percents.length; i++) {
            percents[i] = (alternativeScore[i] * 100) / total;
        }

        return percents;
    }
}
