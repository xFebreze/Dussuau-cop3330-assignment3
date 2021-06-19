package ex41;


/*
                    Pseudo Code

    *(ReadFile) read the text from the input file
        -Store the file into a String
        -Put the String into an array an seperate by newline
        -Store names into a list of maps
    *(App41) Store the information from the input file into a list
        -
    *(OrganizeAlphabetically) Organize the file in alphabetical order
    *(WriteFile) Output the organized list out to a new file

 */

import java.util.List;

public class App41 {

    static public void  main(String[] args){
        ReadFile RF = new ReadFile();
        OrganizeAlphabetically OG = new OrganizeAlphabetically();
        WriteFile WF = new WriteFile();

        List<String> names = RF.Read();

        List<String> sortedNames = OG.organize(names);

        WF.createFile();

        WF.write(sortedNames);
    }
}
