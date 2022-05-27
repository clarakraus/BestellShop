package ShopAufgabe;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @Test

    void shouldReturnListOfProducts(){
        ShopService testShop = new ShopService(new ProductRepo(), new OrderRepo());
        //when
        List<Product> testList = testShop.listProducts();
        assertEquals(3, testList.size());

    }

    @Test

    void shouldReturnProduct(){
        ShopService testShop = new ShopService(new ProductRepo(), new OrderRepo());
        List<Product> testList = testShop.listProducts();
        //when
        Product expected = testList.get(2);
        Product actual = testShop.getProduct(expected.getProductId());
        //then
        assertEquals(expected, actual);

    }

    @Test

    void shouldAddOrder(){
        //given
        ProductRepo testPrRepo = new ProductRepo();
        OrderRepo testOrdRepo = new OrderRepo();
        ShopService testShop = new ShopService(testPrRepo, testOrdRepo);
        List<Product> testList = testPrRepo.list();

        Product orderProduct = testList.get(0);

        Order testOrder = new Order(List.of(orderProduct));

        testShop.addOrder(testOrder);
        Order actual = testShop.getOrder(testOrder.getOrderId());

        assertEquals(testOrder, actual);




    }
}