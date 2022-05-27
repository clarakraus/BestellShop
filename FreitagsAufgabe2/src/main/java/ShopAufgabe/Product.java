package ShopAufgabe;

import java.util.UUID;

public class Product {
    private String name;
    private String productId;

    public Product(String name) {
        this.name = name;
        this.productId = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public String getProductId() {
        return productId;
    }
}
