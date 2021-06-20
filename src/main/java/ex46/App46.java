package ex46;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Alek Dussuau
 */
/*
                    Pseudo Code

    *(ReadFile) read the contents of the input file
        -reads file then returns file content as string
    *(WordCounter) Counts the amount of times a word is used and updates the map value for the word
        -counts each timer word is used throughout string
    *(Histogram) Sorts the numbers of the map as well as makes the histogram
        -Sorts values from map
        -create histogram

 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App46 {

    public static void main(String[] args){
        Map<String, Integer> words = mapMaker();

        ReadFile46 RF = new ReadFile46();
        WordCounter WC = new WordCounter();
        Histogram hist = new Histogram();

        String string = RF.Read();

        words = WC.count(words, string);

        List<Integer> order = hist.sort(words);

        hist.histogram(words, order);

        //hist.sortByValue(words);


    }

    public static Map<String, Integer> mapMaker(){
        Map<String, Integer> map = new HashMap<>();
        map.put("badger", 0);
        map.put("mushroom", 0);
        map.put("snake", 0);
        return map;
    }
}
