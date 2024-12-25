package main.java.com.learning.oracleAcademy.FilesHandling.JsonFiles;

public class Address {
    String street;
    String city;
    String state;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    Address(String streetvalue, String cityValue, String statevalue) {
        this.state = statevalue;
        this.city = cityValue;
        this.street = streetvalue;
    }

    Address(){

    }
}
