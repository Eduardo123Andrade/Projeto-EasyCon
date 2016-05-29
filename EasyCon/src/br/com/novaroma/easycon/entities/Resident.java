package br.com.novaroma.easycon.entities;

import java.io.Serializable;

public class Resident extends Person implements Serializable {

    private static Resident currentResident;

    private Address adrdress;
    private String gender;
    private String login;
    private String password;
    private String phoneNumber;
    private boolean owe;

    @Override
    public String getId() {
        return getCpf();
    }

    public Resident() {
    }

    public Resident(Address adrdress, String gender, String login, String password, String phoneNumber, String name, String lastName, String age, String cpf, boolean owe) {
        super(name, lastName, age, cpf);
        this.adrdress = adrdress;
        this.gender = gender;
        this.login = login;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.owe = owe;
    }

    public Address getAdrdress() {
        return adrdress;
    }

    public void setAdrdress(Address adrdress) {
        this.adrdress = adrdress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isOwe() {
        return owe;
    }

    public void setOwe(boolean owe) {
        this.owe = owe;
    }
    
    public String getOwe() {
        if(owe == true)
            return "Inadimplente";
        else
            return "Nao inadimplente";
    }

    public static Resident getCurrentResident() {
        return currentResident;
    }

    public static void setCurrentResident(Resident aCurrentResident) {
        currentResident = aCurrentResident;
    }
}
