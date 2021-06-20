package ex43;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alek Dussuau
 */
/*
                    Pseudo Code

    *(Main) Prompt user for name, author, javascript, and CSS
    *(PathGeneration) create the paths for the website data
        -Make the Website base folder
        -Make the Website name folder in the website folder
        -Make the html file for the website in the website name folder
        -if the user requested make the js and or css folder
    *(IndexHtml) Create and write to the html file
        -create the html file
        -write to the html file

 */
public class App43 {

    static String name = "";
    static String author = "";
    static String JS_question = "";
    static String CSS_question = "";

    public static void main(String[] args){
        PathGeneration PG = new PathGeneration();

        UserInputs();

        PG.websiteBase();
        PG.websiteFolder(name);
        PG.indexHtml(name, author);
        if(JS_question.equalsIgnoreCase("y")){
            PG.jsFolder(name);
        }
        if(CSS_question.equalsIgnoreCase("y")){
            PG.cssFolder(name);
        }
    }

    public static void UserInputs(){
        Scanner input = new Scanner(System.in);

        System.out.print("Site name: ");
        name = input.nextLine();
        System.out.print("Author: ");
        author = input.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        JS_question = input.nextLine();
        System.out.print("Do you want a folder for CSS? ");
        CSS_question = input.nextLine();
    }
}
