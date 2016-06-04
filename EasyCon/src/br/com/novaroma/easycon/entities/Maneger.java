
package br.com.novaroma.easycon.entities;

import java.io.Serializable;

public class Maneger extends Person implements Serializable{

    private static Maneger currentManeger = new Maneger();
    private double savings;
    
    @Override
    public String getId() {
        return getCpf();
    }

    public Maneger() {
        super("Frodo", "Bolseiro", "50", "11122233344");
    }

    public Maneger(double savings, String name, String lastName, String age, String cpf) {
        super(name, lastName, age, cpf);
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }

    public static Maneger getCurrentManeger() {
        return currentManeger;
    }

    public static void setCurrentManeger(Maneger currentManeger) {
        Maneger.currentManeger = currentManeger;
    }
}
