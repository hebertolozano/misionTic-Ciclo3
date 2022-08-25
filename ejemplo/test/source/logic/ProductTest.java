package logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void getIVA() {
        Product jabon= new Product("248","jabon rey",2_500,300,(byte)5,typeProduct.VIVERES);

    assertEquals(300,jabon.getIVA());

    }
}