package ex42;

import ex41.ReadFile_41;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestReadFile42 {

    @Test
    public void testRead(){
        ReadFile_42 AppTest = new ReadFile_42();

        List<String> expected = Arrays.asList("Ling,Mai,55900", "Johnson,Jim,56500", "Jones,Aaron,46000", "Jones,Chris,34500",
                                                "Swift,Geoffrey,14200", "Xiong,Fong,65000", "Zarnecki,Sabrina,51500");
        List<String> actual = AppTest.Read();
        assertEquals(expected, actual);
    }
}
