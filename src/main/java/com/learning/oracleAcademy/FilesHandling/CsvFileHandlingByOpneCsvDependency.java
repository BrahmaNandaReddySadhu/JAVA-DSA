package main.java.com.learning.oracleAcademy.FilesHandling;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CsvFileHandlingByOpneCsvDependency {
    public static void main(String[] args) throws IOException, CsvValidationException {

        String csvFilePath = "D:\\BrahmanandaReddySadhu\\projects\\JAVA-LEARNING\\DSA\\resources\\example.csv";

        // writing the data into csv file

        CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath));
        writer.writeNext(new String[]{"name", "age", "place"});
        writer.writeNext(new String[]{"sadhu", "20", "ongole"});
        writer.writeNext(new String[]{"brahma", "23", "hyd"});
        writer.flush();
        System.out.println("data sucessfully write into csv file");


        // reading the data from the csv file
        // we need to add opencsv and common-lang3 dependencied

        CSVReader reader = new CSVReader(new FileReader(csvFilePath));
        String[] data;
        while ((data = reader.readNext()) != null) {
            for (String val : data) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }

    }
}
