package main.java.com.learning.oracleAcademy.FilesHandling.CSVFiles;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;

public class CsvRederByApacheCommonCsvDependency {
    public static void main(String[] args) throws IOException {

        String csvFilePath = "D:\\BrahmanandaReddySadhu\\projects\\JAVA-LEARNING\\DSA\\resources\\example.csv";

        // writing data to the csv file

        // commons-csv , commons-io ,commons-codec dependencies need to add
        BufferedWriter writer = new BufferedWriter(new FileWriter(csvFilePath));

        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("name", "age", "place"));
        csvPrinter.printRecord("sadhu", "200", "BBBB");
        csvPrinter.printRecord("sadhu", "100", "AAAA");
        csvPrinter.printRecord("sadhu", "100", "AAAA");
        System.out.println("data added to csv file successfilly");
        csvPrinter.flush();


        // redaing the data

        Reader reader = new FileReader(csvFilePath);
        Iterable<CSVRecord> data = CSVFormat.DEFAULT.withHeader("name", "age", "place").withFirstRecordAsHeader().parse(reader);
        for (CSVRecord val : data) {
            String name = val.get("name");
            String age = val.get("age");
            String place = val.get("place");
            System.out.println(name + "\t" + age + "\t" + place + "\t");

        }
    }
}
