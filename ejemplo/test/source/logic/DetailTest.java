package logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetailTest {
    Detail detail;

    void setup(){

        Product jabon = new Product("001","jabon rey",3_500.0,400,(byte)5, typeProduct.VIVERES);
      detail = new Detail(jabon,(short) 10);
    }

    @Test
    void getSubtotal() {
        setup();

        assertEquals(39_200,detail.getSubtotal());
    }
}