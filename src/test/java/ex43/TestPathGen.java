package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPathGen {

    @Test
    public void TestWebsiteBase_True(){
        PathGeneration AppTest = new PathGeneration();

        boolean expected = true;
        boolean actual = AppTest.websiteBase();
        assertEquals(expected,actual);
    }

    @Test
    public void TestWebsiteFolder_True(){
        PathGeneration AppTest = new PathGeneration();

        boolean expected = true;
        boolean actual = AppTest.websiteFolder("websiteName");
        assertEquals(expected,actual);
    }

    @Test
    public void TestJs_True(){
        PathGeneration AppTest = new PathGeneration();

        boolean expected = true;
        boolean actual = AppTest.jsFolder("websiteName");;
        assertEquals(expected,actual);
    }

    @Test
    public void TestCSS_True(){
        PathGeneration AppTest = new PathGeneration();

        boolean expected = true;
        boolean actual = AppTest.cssFolder("websiteName");;
        assertEquals(expected,actual);
    }

    @Test
    public void TestHTML_True(){
        PathGeneration AppTest = new PathGeneration();

        boolean expected = true;
        boolean actual = AppTest.indexHtml("websiteName","websiteAuthor");
        assertEquals(expected,actual);
    }
}
