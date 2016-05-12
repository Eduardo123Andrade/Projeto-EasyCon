
package br.com.novaroma.easycon.entities;

import java.io.Serializable;
import java.util.Calendar;

public class Invoice extends Entity implements Serializable {

    private int invoiceCode;
    private Resident resident;
    private Calendar date;
    private double totalPrice;
    
    @Override
    public String getId() {
        return String.valueOf(getInvoiceCode());
    }

    public Invoice() {
    }

    public Invoice(int invoiceCode, Resident resident, Calendar date, double totalPrice) {
        this.invoiceCode = invoiceCode;
        this.resident = resident;
        this.date = date;
        this.totalPrice = totalPrice;
    }

    public int getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(int invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
