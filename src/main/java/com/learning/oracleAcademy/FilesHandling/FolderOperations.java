package main.java.com.learning.oracleAcademy.FilesHandling;

import java.io.File;

public class FolderOperations {
    public static void createFolder(String folderName) {
        File file = new File(folderName);
        if (file.mkdir()) {
            System.out.println("directory is created");
        } else {
            System.out.println("directory is not created");
        }

    }

    public static void renameDirectory(String oldDirectoryPath, String newDirectoryPath) {
        File old_dir = new File(oldDirectoryPath);
        File new_dir = new File(newDirectoryPath);


        if (!old_dir.exists()) {
            System.out.println("Directory not exists creating new one ");
            old_dir.mkdir();
        }

        if (old_dir.renameTo(new_dir)) {
            System.out.println("successfully renamed");
        } else {
            System.out.println("Not renamed");
        }


    }

    public static void deleteFolder(String folderName) {
        File file = new File(folderName);
        if (file.delete()) {
            System.out.println("Directory deleted");
        } else {
            System.out.println("Directory not deleted");
        }

    }

    public static void main(String[] args) {
        String folder = "D:\\BrahmanandaReddySadhu\\projects\\JAVA-LEARNING\\DSA\\resources\\FilesData";
        String old_data = "D:\\BrahmanandaReddySadhu\\projects\\JAVA-LEARNING\\DSA\\resources\\FilesDataOld";
        String new_data = "D:\\BrahmanandaReddySadhu\\projects\\JAVA-LEARNING\\DSA\\resources\\FilesDataNew";

        createFolder(folder);
        renameDirectory(old_data, new_data);
        deleteFolder(folder);

    }
}
