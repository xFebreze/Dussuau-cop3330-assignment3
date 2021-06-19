package ex41;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWriteFile41 {

    @Test
    public void TestCreate(){
        WriteFile_41 AppTest = new WriteFile_41();

        boolean expected = true;
        boolean actual = AppTest.createFile();
        assertEquals(expected, actual);
    }

    @Test
    public void TestWrite(){
        WriteFile_41 AppTest = new WriteFile_41();

        boolean expected = true;
        boolean actual = AppTest.write(Arrays.asList("Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina", "Jones, Chris",
                "Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong"));
        assertEquals(expected, actual);
    }
}
