package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class IndexHtml {

    public static boolean createFile(String htmlPath){
        try {
            File file = new File(htmlPath);

            if(!file.exists()){

                file.createNewFile();
                System.out.printf("Created %s\n", file.getPath());
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean writeFile(String htmlPath, String name, String author){
        FileWriter output_file = null;
        try {
            output_file = new FileWriter(htmlPath);

            String output = "<html>\n<head>\n";
            output += String.format("\t<title>%s</title>\n\t<meta name=\"author\" content=\"%s\">\n",name,author);
            output += "</head>\n</html>";

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
