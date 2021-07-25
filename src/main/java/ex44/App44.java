package ex44;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alek Dussuau
 */
public class App44 {

    public static void main(String[] args){
        //makes an object of the the file reader
        //calls the file reader to read the json file and get out list of products
        //call the product search function using the list of products

        ReadFile44 readFile44 = new ReadFile44();

        ProductModel pr = readFile44.jsonReader();

        productSearch(pr);
    }

    public static void productSearch(ProductModel pr){
        Boolean conditional = true;
        String temp = "";
        Scanner input = new Scanner(System.in);

        while(conditional){
            System.out.print("What is the product name?");
            temp = input.nextLine();
            for(int i = 0; i < pr.products.size(); i++){
                if(temp.equals(pr.products.get(i).getName())){
                    System.out.printf("Name: %s\nPrice: %.2f\nQuantity: %d",pr.products.get(i).getName(),pr.products.get(i).getPrice(),pr.products.get(i).getQuantity());
                    return;
                }
            }
            System.out.println("Sorry, that product was not found in our inventory.");
        }
    }



}
