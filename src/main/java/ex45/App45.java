package ex45;


import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alek Dussuau
 */
/*
                    Pseudo Code

    *(Main) Prompt user for name of the new file
        -Ask user for a name for a new file
    *(ReadFile) read the contents of the input file
        -reads file then returns file content as string
    *(Replacer) Replaces the word utilize in a string with use
    *(WriteFile) Creates new file and uploads edited string to new file
        -file name is based on user input
        -create file
        -writes to file updated string

 */
public class App45 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ReadFile45 RF = new ReadFile45();
        TextReplacer TR = new TextReplacer();
        WriteFile45 WF = new WriteFile45();

        System.out.println("Name for File: ");
        String fileName = input.nextLine();

        String file = RF.Read();

        String newFile = TR.useReplacer(file);

        WF.createFile(fileName);
        WF.writeFile(newFile, fileName);
    }
}
