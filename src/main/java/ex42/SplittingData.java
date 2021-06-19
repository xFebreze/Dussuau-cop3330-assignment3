package ex42;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alek Dussuau
 */
import java.util.ArrayList;
import java.util.List;

public class SplittingData {

    public static List<String[]> ListConverter(List<String> list){
        List<String[]> temp = new ArrayList<String[]>();

        for(int i = 0; i < list.size(); i++){
            temp.add((list.get(i).split(",")));
        }

        return temp;
    }

}
