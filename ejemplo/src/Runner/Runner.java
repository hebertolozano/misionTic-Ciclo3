package Runner;

import logic.Product;
import logic.typeProduct;

public class Runner {
    public static void main(String[] args) {

        Product jabon = new Product("001","jabon rey",3_500.0,400,(byte)5, typeProduct.VIVERES);

        jabon.setTypeProduct(typeProduct.LICORES);

        System.out.println("el valor del iva es: "+ jabon.getIVA());
    }
}
