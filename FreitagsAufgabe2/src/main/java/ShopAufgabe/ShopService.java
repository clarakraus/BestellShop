package ShopAufgabe;

import java.util.List;

public class ShopService {

    private ProductRepo allMyProducts;
    private OrderRepo allMyOrders;

    public ShopService(ProductRepo onlyProducts, OrderRepo allMyOrders) {
        this.allMyProducts = onlyProducts;
        this.allMyOrders = allMyOrders;
    }

    //get
    public Product getProduct(String id){
        return allMyProducts.getProduct(id);}


    public List<Product> listProducts() {
        return allMyProducts.list();
    }

    public void addOrder(Order order){
        allMyOrders.add(order);

    }
    public Order getOrder(String id){
        return allMyOrders.getOrder(id);}


    public List<Order> listOrders() {
        return allMyOrders.list();
    }
}
