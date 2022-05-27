package ShopAufgabe;

import java.util.UUID;

public class Order {

    private String orderId;
    private Product product;

    public Order(Product product) {
        this.product = product;
        this.orderId = UUID.randomUUID().toString();
    }

    public String getOrderId() {
        return orderId;
    }

    public Product getProduct() {
        return product;
    }
}
