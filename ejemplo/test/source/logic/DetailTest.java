package logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetailTest {
    Detail detail;
    Detail detail2;

    void setup(){

        Product jabon = new Product("001","jabon rey",3_500.0,400,(byte)5, typeProduct.VIVERES);
        Product wisky = new Product("002","wisky old pard",120_000.0,5,(byte)5, typeProduct.LICORES);


        detail = new Detail(jabon,(short) 10);
        detail2 = new Detail(wisky,(short) 2);

    }

    @Test
    void getSubtotal() {
        setup();

        assertEquals(39_200,detail.getSubtotal());
        assertEquals(285_600,detail2.getSubtotal());
    }
}