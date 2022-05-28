package ShopAufgabe;

import java.util.List;
import java.util.UUID;

public class Order {

    private String orderId;
    private List<Product> products;

    public Order(List<Product> products) {
        this.products = products;
        this.orderId = UUID.randomUUID().toString();
    }

    public String getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }
}
