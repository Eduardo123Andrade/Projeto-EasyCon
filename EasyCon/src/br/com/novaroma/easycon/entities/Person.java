
package br.com.novaroma.easycon.entities;

public abstract class Person extends Entity {
    
    private String name;
    private String lastName;
    private String age;
    private String cpf;

    public Person() {
    }

    public Person(String name, String lastName, String age, String cpf) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
