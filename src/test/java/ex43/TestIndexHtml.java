package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIndexHtml {

    @Test
    public void CreateFileTest(){
        IndexHtml AppTest = new IndexHtml();

        boolean expected = true;
        boolean actual = AppTest.createFile("resources/index1.html");
        assertEquals(expected, actual);
    }

    @Test
    public void WriteFileTest(){
        IndexHtml AppTest = new IndexHtml();

        boolean expected = true;
        boolean actual = AppTest.writeFile("resources/index2.html","websiteName","websiteAuthor");
        assertEquals(expected, actual);
    }
}
