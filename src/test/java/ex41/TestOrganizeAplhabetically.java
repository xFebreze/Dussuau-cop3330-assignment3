package ex41;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOrganizeAplhabetically {

    @Test
    public void testOrganize(){
        OrganizeAlphabetically AppTest = new OrganizeAlphabetically();

        List<String> expected = Arrays.asList("Johnson, Jim", "Jones, Aaron", "Jones, Chris", "Ling, Mai", "Swift, Geoffrey",
                "Xiong, Fong", "Zarnecki, Sabrina");
        List<String> actual = AppTest.organize(Arrays.asList("Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina", "Jones, Chris",
                "Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong"));
        assertEquals(expected, actual);
    }
}
