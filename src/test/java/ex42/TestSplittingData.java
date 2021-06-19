package ex42;

import ex41.OrganizeAlphabetically;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSplittingData {

    @Test
    public void testOrganize(){
        SplittingData AppTest = new SplittingData();

        List<String[]> expected = hardcodedList();
        List<String[]> actual = AppTest.ListConverter(Arrays.asList("Ling,Mai,55900", "Johnson,Jim,56500", "Jones,Aaron,46000", "Jones,Chris,34500",
                "Swift,Geoffrey,14200", "Xiong,Fong,65000", "Zarnecki,Sabrina,51500"));

        for(int i = 0; i < hardcodedList().size(); i++){
            for(int j = 0; j < 3; j++){
                assertEquals((expected.get(i))[j],(actual.get(i))[j]);
            }
        }
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
