package ex46;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alek Dussuau
 */
import java.util.Map;

public class WordCounter {

    public static Map<String, Integer> count(Map<String, Integer> map, String string){
        String[] strArr = string.split("\\s+");
        for(int i = 0; i < strArr.length; i++){
            if(map.containsKey(strArr[i])){
                map.put(strArr[i], map.get(strArr[i]) + 1);
            }
        }
        return map;
    }
}
