package ex44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadFileTest {

    @Test
    public void jsonReaderTest(){
        ReadFile44 AppTest = new ReadFile44();
        ProductModel pr = new ProductModel();

        pr = AppTest.jsonReader();

        assertEquals("Widget",pr.products.get(0).getName());
        assertEquals(25.00,pr.products.get(0).getPrice());
        assertEquals(5,pr.products.get(0).getQuantity());
    }
}
