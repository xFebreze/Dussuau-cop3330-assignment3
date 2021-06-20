package ex46;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HistogramTest {

    @Test
    public void sortTest(){
        Histogram AppTest = new Histogram();

        List<Integer> expected = new ArrayList<>();
        expected.add(7);
        expected.add(2);
        expected.add(1);
        List<Integer> actual = AppTest.sort(mapMakerTwo());
        assertEquals(expected, actual);
    }

    public Map<String, Integer> mapMakerTwo(){
        Map<String, Integer> temp = new HashMap<>();

        temp.put("badger", 7);
        temp.put("mushroom", 2);
        temp.put("snake", 1);
        return temp;
    }
}
