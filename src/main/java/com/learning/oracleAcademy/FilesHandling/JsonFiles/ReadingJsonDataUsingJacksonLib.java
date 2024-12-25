package main.java.com.learning.oracleAcademy.FilesHandling.JsonFiles;

import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingJsonDataUsingJacksonLib {
    public static void main(String[] args) throws IOException {

        // Deserialization ; json Object to java object

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("D:\\BrahmanandaReddySadhu\\projects\\JAVA-LEARNING\\DSA\\resources\\test.json");
        // read the josn data from file amnd amp to person class
        Person person = objectMapper.readValue(file, Person.class);
        // access the data
        System.out.println("firstname-->" + person.getFirstname());
        System.out.println("lastname-->" + person.getLastname());

        List<Address> address = person.getAddress();
        for (Address addressValue : address) {
            System.out.println("Street-->" + addressValue.getStreet());
            System.out.println("City-->" + addressValue.getCity());
            System.out.println("State-->" + addressValue.getState());
        }


        // read the josn from the string


        String josnString = "{\n" +
                "  \"firstname\": \"sadhu\",\n" +
                "  \"lastname\": \"brahma\",\n" +
                "  \"address\": [\n" +
                "    {\n" +
                "      \"street\": \"abc\",\n" +
                "      \"city\": \"delhi\",\n" +
                "      \"state\": \"TL\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"street\": \"abc\",\n" +
                "      \"city\": \"delhi\",\n" +
                "      \"state\": \"TL\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";


        Person stringPerson = objectMapper.readValue(josnString, Person.class);
        String fname = stringPerson.getFirstname();
        String lname = stringPerson.getLastname();

        List<Address> stringAddress = stringPerson.getAddress();
        for (Address add : stringAddress) {
            System.out.println(add.getCity());
            System.out.println(add.getState());
            System.out.println(add.getStreet());
        }


        ObjectMapper mapper = new ObjectMapper();


        //converting java object to json object serialization
        Person personObject = new Person();
        personObject.setFirstname("Bhoomi");
        personObject.setLastname("Yamuna");

        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("main", "ongole", "ap"));
        addresses.add(new Address("main", "ongole", "ap"));
        addresses.add(new Address("main", "ongole", "ap"));
        addresses.add(new Address("main", "ongole", "ap"));

        personObject.setAddress(addresses);
        String josnObject = mapper.writeValueAsString(personObject);
        System.out.println(josnObject);
    }
}
