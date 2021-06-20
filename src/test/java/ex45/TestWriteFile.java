package ex45;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWriteFile {

    @Test
    public void TestCreate(){
        WriteFile45 AppTest = new WriteFile45();

        boolean expected = true;
        boolean actual = AppTest.createFile("test");
        assertEquals(expected, actual);
    }

    @Test
    public void TestWrite(){
        WriteFile45 AppTest = new WriteFile45();

        boolean expected = true;
        boolean actual = AppTest.writeFile("One should never utilize the word \\\"utilize\\\" in writing. Use \\\"use\\\" instead.\\n\" +\n" +
                "                \"For example, \\\"She uses an IDE to write her Java programs\\\" instead of \\\"She\\n\" +\n" +
                "                \"utilizes an IDE to write her Java programs\\\".","test");
        assertEquals(expected, actual);
    }
}
