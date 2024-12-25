package main.java.com.learning.oracleAcademy.FilesHandling.JsonFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Person {
    String firstname;
    String lastname;
    List<Address> address;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public String toString(){
        return getFirstname() +" ," +getLastname() + " ,"+ getAddress();
    }
}
