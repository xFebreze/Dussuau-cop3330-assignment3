package ex45;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alek Dussuau
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile45 {

    public static boolean createFile(String fileName){
        String path = String.format("resources/%s.txt", fileName);
        try {
            File file = new File(path);

            if(!file.exists()){

                file.createNewFile();
                System.out.printf("Created %s\n", file.getPath());
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean writeFile(String string, String name){
        String path = String.format("resources/%s.txt", name);
        FileWriter output_file = null;
        try {
            output_file = new FileWriter(path);

            String output = string;

            output_file.write(output);
            output_file.close();
            return true;
        } catch (IOException e) {
            System.out.println("File doesn't exist");
            e.printStackTrace();
        }
        return false;
    }
}
