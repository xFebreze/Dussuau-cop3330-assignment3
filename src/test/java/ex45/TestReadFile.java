package ex45;

import ex42.ReadFile_42;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReadFile {

    @Test
    public void testRead(){
        ReadFile45 AppTest = new ReadFile45();

        String expected = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "utilizes an IDE to write her Java programs\".\n";
        String actual = AppTest.Read();
        assertEquals(expected, actual);
    }

}
