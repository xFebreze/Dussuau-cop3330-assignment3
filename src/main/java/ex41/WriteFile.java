package ex41;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {

    public static boolean createFile(){
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
