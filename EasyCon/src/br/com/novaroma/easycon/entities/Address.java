
package br.com.novaroma.easycon.entities;

public class Address {

    private String city;
    private String district;
    private String block;
    private String building;
    private String number;

    public Address() {
    }

    public Address(String city, String district, String block, String building, String number) {
        this.city = city;
        this.district = district;
        this.block = block;
        this.building = building;
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
