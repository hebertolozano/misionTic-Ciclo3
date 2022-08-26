package logic;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class BillTest {
    private Bill bill;
    private Product soap;
    private Product wisky;
    private Product rice;
    private Product ibuprofeno;
    private Product ron;


    void setup(){
        bill=new Bill("003", LocalDate.of(2019, Month.JANUARY,30));
        soap=new Product("004","jabon rey",3500,320,(byte)10,typeProduct.VIVERES);
        wisky=new Product("005","buchannas",120_000,18,(byte)3,typeProduct.LICORES);
        rice = new Product("006","arroz diana",48_000,132,(byte) 10,typeProduct.VIVERES);
        ibuprofeno= new Product("006","Ibuprofeno",12_500,76,(byte) 10,typeProduct.MEDICAMENTOS);
        ron=new Product("007","Ron Caldas",65_000,30,(byte) 5,typeProduct.LICORES);
    }

    @Test
    void addDetail() {
        setup();
        assertTrue(bill.addDetail(new Detail(soap,(short) 2)));
        assertTrue(bill.addDetail(new Detail(ron,(short) 25)));
        assertEquals(318,soap.getStock());
        assertEquals(5,ron.getStock());
    }

    @Test
    void getTotal() {
    }
}