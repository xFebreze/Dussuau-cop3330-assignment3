package ex42;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alek Dussuau
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile_42 {

    public static List<String> Read(){
        List<String> ret = new ArrayList<String>();
        File input_file = new File("resources/exercise42_input.txt");
        Scanner f_input = null;
        try {
            f_input = new Scanner(input_file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(f_input.hasNextLine()){
            String fileLine = f_input.nextLine();
            ret.add(fileLine);
        }

        return ret;
    }


}
