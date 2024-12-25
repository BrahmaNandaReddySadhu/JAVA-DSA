package main.java.com.learning.oracleAcademy.FilesHandling.JsonFiles;

import com.google.gson.Gson;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadingJsonUsingGSONLib {
    public static void main(String[] args) throws FileNotFoundException {


        // Desirialisation : json object to java object
        FileReader reader = new FileReader("D:\\BrahmanandaReddySadhu\\projects\\JAVA-LEARNING\\DSA\\resources\\test.json");
        Gson gson = new Gson();
        Person person = gson.fromJson(reader, Person.class);
        System.out.println(person.getFirstname());
        System.out.println(person.getLastname());

        for (Address address : person.getAddress()) {
            System.out.println(address.getStreet());
            System.out.println(address.getCity());
            System.out.println(address.getState());
        }


        // serialization : java object to json object


        Gson gson1 = new Gson();

        Person person1 = new Person();
        person1.setLastname("Brahma");
        person1.setFirstname("sadhu");
        List<Address> addressList = new ArrayList<>();
        addressList.add(new Address("main","ongole","ap"));
        addressList.add(new Address("main","ongole","ap"));
        person1.setAddress(addressList);

        String stringObjectValue=gson1.toJson(person1);
        System.out.println(stringObjectValue);


    }
}
