package ex41;


/*
                    Pseudo Code

    *(ReadFile) read the text from the input file
        -Store the file into by line into a list
        -return the list
    *(OrganizeAlphabetically) Organize the file in alphabetical order
        -sort the list
    *(WriteFile) Output the organized list out to a new file
        -create a file
        -write an output for the file
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
