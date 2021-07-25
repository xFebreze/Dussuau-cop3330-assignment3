package ex44;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class ReadFile44 {

     public ProductModel jsonReader(){
         //Create a Gson parser to read the json file
         //Read the file and store into our data classes

         Gson gson = new Gson();
         BufferedReader br = null;

         try {
             br = new BufferedReader(new FileReader("resources/exercise44_input.json"));
             ProductModel productModel = gson.fromJson(br, ProductModel.class);

             return productModel;
         }catch (FileNotFoundException e){
             e.printStackTrace();
         }
         return null;
     }
}
