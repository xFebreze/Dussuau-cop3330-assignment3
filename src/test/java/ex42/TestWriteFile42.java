package ex42;

import ex41.WriteFile_41;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWriteFile42 {



    @Test
    public void TestCreate(){
        WriteFile_42 AppTest = new WriteFile_42();

        boolean expected = true;
        boolean actual = AppTest.createFile();
        assertEquals(expected, actual);
    }

    @Test
    public void TestWrite(){
        WriteFile_42 AppTest = new WriteFile_42();

        List<String[]> list = hardcodedList();



        boolean expected = true;
        boolean actual = AppTest.write(list);
        assertEquals(expected, actual);
    }

    public List<String[]> hardcodedList(){
        List<String[]> temp = new ArrayList<>();
        String[] one = {"Ling","Mai","55900"};
        String[] two = {"Johnson","Jim","56500"};
        String[] three = {"Jones","Aaron","46000"};
        String[] four = {"Jones","Chris","34500"};
        String[] five = {"Swift","Geoffrey","14200"};
        String[] six = {"Xiong","Fong","65000"};
        String[] seven = {"Zarnecki","Sabrina","51500"};

        temp.add(one);
        temp.add(two);
        temp.add(three);
        temp.add(four);
        temp.add(five);
        temp.add(six);
        temp.add(seven);

        return temp;
    }
}
