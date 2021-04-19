import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        ProductManager productManager = new ProductManager(products);
        Product product1 = new Product(1,"Product1",200);
        productManager.addProduct(0,product1);
        productManager.addProduct(1,new Product(2,"Product2",100));
        productManager.addProduct(2,new Product(3,"Product3",200));
        productManager.addProduct(3,new Product(4,"Product4",1000));
        productManager.showProducts();
    }
}
