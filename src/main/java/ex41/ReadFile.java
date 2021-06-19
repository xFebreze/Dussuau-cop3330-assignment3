package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

    public static List<String> Read(){
        List<String> ret = new ArrayList<String>();
        File input_file = new File("resources/exercise41_input.txt");
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

        //Testing
        //System.out.println(ret);
        return ret;
    }


}
