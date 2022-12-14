package logic;

public class Product {
    private String idProduct;
    private String description;
    private double value;
    private int stock;
    private byte stockMin;
    private typeProduct typeProduct;

    public Product(String idProduct, String description, double value, int stock, byte stockMin, logic.typeProduct typeProduct) {
        this.idProduct = idProduct;
        this.description = description;
        this.value = value;
        this.stock = stock;
        this.stockMin = stockMin;
        this.typeProduct = typeProduct;
    }


    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public byte getStockMin() {
        return stockMin;
    }

    public void setStockMin(byte stockMin) {
        this.stockMin = stockMin;
    }

    public logic.typeProduct getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(logic.typeProduct typeProduct) {
        this.typeProduct = typeProduct;
    }



    public double getIVA(){
        //nueva metodologia
        double iva=switch (typeProduct){
            case VIVERES ->  getValue() *0.12;
            case  LICORES ->  getValue() *0.19;
            case  MEDICAMENTOS ->  getValue() *0.16;
            default -> 0.0;
        };
        return iva;

     /*switch (typeProduct){
         case VIVERES : return getValue() *0.12;
         case  LICORES: return getValue() *0.19;
         case  MEDICAMENTOS: return getValue() *0.16;
     }
     return 0.0;*/
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", description='" + description + '\'' +
                ", value=" + value +
                ", stock=" + stock +
                ", stockMin=" + stockMin +
                ", typeProduct=" + typeProduct +
                '}';
    }
}
