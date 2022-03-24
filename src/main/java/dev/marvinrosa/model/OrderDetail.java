package dev.marvinrosa.model;

public class OrderDetail {

    private int quantity;
    private Product product;

    public OrderDetail(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    public float subTotalCalc(){
        return this.quantity * this.product.getPrice();
    }

    //pendiente del toString()
    @Override
    public String toString() {
        return  product +

                "\t\t\t" +  quantity +
                "\t\t\t" + subTotalCalc();
    }
}
