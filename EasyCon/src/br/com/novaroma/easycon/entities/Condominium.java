
package br.com.novaroma.easycon.entities;

import java.io.Serializable;

public class Condominium extends Entity implements Serializable{
    
    private String name;
    private int maxQuantity;
    private int currentQuantity;
    private double rental;
    private Allocation[] allocation;

     @Override
    public String getId() {
        return name;
    }
    
    public Condominium() {
    }

    public Condominium(String name, int maxQuantity, int currentQuantity, double rental, int quantityAllocation) {
        this.name = name;
        this.maxQuantity = maxQuantity;
        this.currentQuantity = currentQuantity;
        this.rental = rental;
        allocation = new Allocation[quantityAllocation];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public double getRental() {
        return rental;
    }

    public void setRental(double rental) {
        this.rental = rental;
    }

    public Allocation[] getAllocation() {
        return allocation;
    }

    public void setAllocation(Allocation[] allocation) {
        this.allocation = allocation;
    }
}
