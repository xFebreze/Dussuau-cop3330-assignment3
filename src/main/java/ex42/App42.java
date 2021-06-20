package ex42;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alek Dussuau
 */
/*
                    Pseudo Code

    *(ReadFile) read the text from the input file
        -Store the file into by line into a list
        -return the list
    *(SplitingData) Organize the file in alphabetical order
        -Turns the list of strings into a list of String arrays
    *(WriteFile) Output the organized list out to a new file
        -create a file
        -write an output for the file

 */
import java.util.List;


public class App42 {

    public static void main(String[] args){
        ReadFile_42 RF = new ReadFile_42();
        SplittingData SD = new SplittingData();
        WriteFile_42 WF = new WriteFile_42();



        List<String> data = RF.Read();

        List<String[]> list = SD.ListConverter(data);

        System.out.println(list);
        WF.createFile();

        WF.write(list);
    }


}
