package ShopAufgabe;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepo {

    private Map<String, Product> allMyProduct = new HashMap<>();

    public ProductRepo() {
        Product product1 = new Product("Eis");
        Product product2 = new Product("Blumen");
        Product product3 = new Product("Tofu");

        allMyProduct.put(product1.getProductId(), product1);
        allMyProduct.put(product2.getProductId(), product2);
        allMyProduct.put(product3.getProductId(), product3);
    }

    public List<Product> list(){
        return allMyProduct.values().stream().toList();
    }

    public Product getProduct(String id){
        return allMyProduct.get(id);
    }
}
