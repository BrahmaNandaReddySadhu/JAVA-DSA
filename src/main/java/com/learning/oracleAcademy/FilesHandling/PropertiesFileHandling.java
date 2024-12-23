package main.java.com.learning.oracleAcademy.FilesHandling;

import java.io.*;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileHandling {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        properties.setProperty("name", "sadhu");
        properties.setProperty("age","25");
        String path = "D:\\BrahmanandaReddySadhu\\projects\\JAVA-LEARNING\\DSA\\resources\\data.properties";

        // storing data to file
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        properties.store(fileOutputStream, "stored the data in the properties file");
        fileOutputStream.close();


        // reading the data from properties file
        FileInputStream fileInputStream = new FileInputStream(path);
        properties.load(fileInputStream);
        fileInputStream.close();

        String nameValue=properties.getProperty("name");
        System.out.println(nameValue);  // sadhu

        // read all the keys  we have some approaches
        Set<String> valuesAsString  = properties.stringPropertyNames();
        System.out.println(valuesAsString);  //    [name, age]

        // read all the properties

        Set<Object> valuesAsObjects  =properties.keySet();
        System.out.println(valuesAsObjects);

        // read all the values from the properties file

        for(String key : properties.stringPropertyNames()){
            System.out.println(properties.getProperty(key));
        }

    }
}
