
package br.com.novaroma.easycon.entities;

import java.util.Date;

public class Allocation {
    
    private String name;
    private Date date; //Rever
    private double price;

    public Allocation() {
    }

    public Allocation(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
