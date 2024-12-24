package main.java.com.learning.oracleAcademy.FilesHandling.CSVFiles;

import java.io.*;

public class CsvFileUsingBufferReaderAndWriter {
    public static void main(String[] args) throws IOException {

        String csvFilePath= "D:\\BrahmanandaReddySadhu\\projects\\JAVA-LEARNING\\DSA\\resources\\example.csv";

        //  write the data to the csv file

        BufferedWriter writer = new BufferedWriter(new FileWriter(csvFilePath));

        writer.write("name,age,place");
        writer.newLine();

        writer.write("sadhu,10,umpuram");
        writer.newLine();
        writer.write("brahma,20,ongole");
        writer.newLine();

        writer.flush();
        writer.close();

        System.out.println("write the data sucessfully");



        // read the data from the csv file

        BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
        String data ;
        while( (data = reader.readLine())!=null){
            String [] value = data.split(",");
            for(String val:value){
                System.out.print(val +"\t");
            }
            System.out.println();
        }




    }
}
