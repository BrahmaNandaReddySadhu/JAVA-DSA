package main.java.com.learning.oracleAcademy.FilesHandling.JsonFiles;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingJsonfromJsonSimpleLib {
    public static void main(String[] args) throws IOException, ParseException {

        // We don't need to create a pojo class if you are using simple json library

        JSONParser jsonParser = new JSONParser();
        FileReader fileReader = new FileReader("D:\\BrahmanandaReddySadhu\\projects\\JAVA-LEARNING\\DSA\\resources\\test.json");
        Object object = jsonParser.parse(fileReader);  // convert json file to Java object
        JSONObject jsonObject = (JSONObject) object;   // java - Json Object
        String fname = (String) jsonObject.get("firstname");
        String lname = (String) jsonObject.get("lastname");
        System.out.println(fname);
        System.out.println(lname);

        //
        JSONArray jsonArray = (JSONArray) jsonObject.get("address");
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject obj = (JSONObject) jsonArray.get(i);
            String city = (String) obj.get("city");
            String state = (String) obj.get("state");
            String street = (String) obj.get("street");
            System.out.println(city + "," + state + "," + street);

        }


        // writing data (serialozation)

        JSONObject person = new JSONObject();

        person.put("fname", "sadhu");
        person.put("lastname", "brahma");

        JSONObject address1 = new JSONObject();

        address1.put("street", "main");
        address1.put("city", "ongole");
        address1.put("state", "TN");
        JSONObject address2 = new JSONObject();

        address2.put("street", "main");
        address2.put("city", "ongole");
        address2.put("state", "TN");

        JSONArray jsonArrayValue = new JSONArray();
        jsonArrayValue.add(address1);
        jsonArrayValue.add(address2);
        person.put("address", jsonArrayValue);

        String value = person.toJSONString();
        System.out.println(value);


    }
}
