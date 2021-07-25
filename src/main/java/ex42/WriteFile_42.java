package ex42;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alek Dussuau
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile_42 {

    public static boolean createFile(){
        //creates a file

        try {
        File file = new File("resources/exercise42_output.txt");

        if(!file.exists()){

            file.createNewFile();
            return true;
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean write(List<String[]> list){
        //Takes in a file variable
        //Make a file writer so we can write to the file
        //make a loop so we can output data to file in a organized fashion
        //close file

        FileWriter output_file = null;
        try {
            output_file = new FileWriter("resources/exercise42_output.txt");

            String output = ("Last      First     Salary\n--------------------------\n");
            for(int i = 0; i < list.size(); i++){
                output += String.format("%-9s %-9s %-6s\n",(list.get(i))[0],(list.get(i))[1],(list.get(i))[2]);
            }

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
