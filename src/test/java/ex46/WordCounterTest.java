package ex46;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTest {

    @Test
    public void WC_Test(){
        WordCounter AppTest = new WordCounter();

        Map<String, Integer> expected = mapMakerTwo();
        Map<String, Integer> actual = AppTest.count(mapMakerOne(),"badger badger badger \n" +
                "badger mushroom \n" +
                "mushroom snake badger badger \n" +
                "badger");
        assertEquals(expected, actual);
    }

    public Map<String, Integer> mapMakerOne(){
        Map<String, Integer> temp = new HashMap<>();

        temp.put("badger", 0);
        temp.put("mushroom", 0);
        temp.put("snake", 0);
        return temp;
    }

    public Map<String, Integer> mapMakerTwo(){
        Map<String, Integer> temp = new HashMap<>();

        temp.put("badger", 7);
        temp.put("mushroom", 2);
        temp.put("snake", 1);
        return temp;
    }
}
