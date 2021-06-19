package ex41;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReadFile41 {

    @Test
    public void testRead(){
        ReadFile_41 AppTest = new ReadFile_41();

        List<String> expected = Arrays.asList("Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina", "Jones, Chris",
                                                "Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong");
        List<String> actual = AppTest.Read();
        assertEquals(expected, actual);
    }
}
