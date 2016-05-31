
package br.com.novaroma.easycon.entities;

import java.io.Serializable;

public class Maneger extends Person implements Serializable{

    private double savings;
    
    @Override
    public String getId() {
        return getCpf();
    }

    public Maneger() {
    }

    public Maneger(double savings, String name, String lastName, String age, String cpf) {
        super("Frodo", "Bolseiro", "50", "11122233344");
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }
}
