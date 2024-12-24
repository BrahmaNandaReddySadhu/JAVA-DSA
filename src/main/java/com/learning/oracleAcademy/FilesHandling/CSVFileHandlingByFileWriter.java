package main.java.com.learning.oracleAcademy.FilesHandling;

import java.io.*;
import java.util.Scanner;

public class CSVFileHandlingByFileWriter {
    public static void main(String[] args) throws IOException {

        String csvFileName = "D:\\BrahmanandaReddySadhu\\projects\\JAVA-LEARNING\\DSA\\resources\\example.csv";

        // write data into csv file

        FileWriter writer = new FileWriter(csvFileName);
        writer.append("name,age,email\n");
        writer.append("sadhu,20,brahma@gmail.com\n");
        writer.append("brahma,20,sadhu@gmail.com\n");
        writer.append("reddy,20,aaa@gmail.com\n");
        writer.close();
        System.out.println("csv file created at the location" + csvFileName);


        // read data from csv file

        // 1 using scanner class

        File file = new File(csvFileName);
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            System.out.print(scanner.next() + "\t");
        }

        // 2. using  java split method
        String filePath = "D:\\BrahmanandaReddySadhu\\projects\\JAVA-LEARNING\\DSA\\resources\\example.csv";
        FileReader reader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = (bufferedReader.readLine())) != null) {
            String array[] = line.split(",");
            for (String value : array) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }


    }
}
