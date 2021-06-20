package ex45;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alek Dussuau
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile45 {

    public static String Read(){

        String inputFile = "";
        File input_file = new File("resources/exercise45_input.txt");
        Scanner f_input = null;
        try {
            f_input = new Scanner(input_file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(f_input.hasNextLine()){
            String fileLine = f_input.nextLine();
            inputFile += fileLine + "\n";
        }

        return inputFile;
    }
}
