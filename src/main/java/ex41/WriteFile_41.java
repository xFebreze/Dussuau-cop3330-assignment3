package ex41;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alek Dussuau
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile_41 {

    public static boolean createFile(){
        //creates a file

        try {
        File file = new File("resources/exercise41_output.txt");

        if(!file.exists()){

            file.createNewFile();
            return true;
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean write(List<String> sortedNames){
        //Takes in a file variable
        //Make a file writer so we can write to the file
        //make a loop so we can output data to file in a organized fashion
        //close file

        FileWriter output_file = null;
        try {
            output_file = new FileWriter("resources/exercise41_output.txt");

            String output = String.format("Total of %d names\n--------------------\n", sortedNames.size());
            for(int i = 0; i < sortedNames.size(); i++){
                output += sortedNames.get(i) + "\n";
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
