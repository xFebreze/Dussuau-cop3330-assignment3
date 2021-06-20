package ex46;

import ex45.ReadFile45;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadFile46Test {

    @Test
    public void testRead(){
        ReadFile46 AppTest = new ReadFile46();

        String expected = "badger badger badger\n" +
                "badger mushroom\n" +
                "mushroom snake badger badger\n" +
                "badger\n";
        String actual = AppTest.Read();
        assertEquals(expected, actual);
    }
}
