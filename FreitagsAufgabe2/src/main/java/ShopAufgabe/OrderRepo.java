package ShopAufgabe;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepo {

    private Map<String, Order> allMyOrders = new HashMap<>();

    public void add(Order order){
        allMyOrders.put(order.getOrderId(), order);
    }
    public List<Order> list(){
        return allMyOrders.values().stream().toList();
    }

    public Order getOrder(String id){
        return allMyOrders.get(id);
    }
}
