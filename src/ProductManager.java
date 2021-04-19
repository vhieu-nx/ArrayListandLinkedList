import java.sql.SQLOutput;
import java.util.*;

public class ProductManager  {
    private List<Product> products;
    private Scanner scanner = new Scanner(System.in);

    public ProductManager(List<Product> products) {
        this.products = products;
    }

    public void addProduct(int index, Product product){
        products.add(index,product);
    }
    public void setProduct(int id){
        for (Product product: products
             ) {
            if(product.getId()==id){
                System.out.println("Mời thay id");
                product.setId(scanner.nextInt());
                System.out.println("Mời thay tên");
                product.setName(scanner.next());
                System.out.println("Mời thay giá");
                product.setPrice(scanner.nextDouble());
            }
        }
    }
    public void removeProduct(int id){
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId()==id){
                products.remove(i);
            }
        }
    }
    public void getProductByName(String name){
        for (Product product: products) {
            if(product.getName()==name){
                System.out.println(product);
            }
        }
    }
    public void showProducts(){
        softProducts();
        System.out.println(products);
    }
    private void softProducts(){
        Comparator<Product> a = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice()>o2.getPrice())
                    return 1;

                else if(o1.getPrice()==o2.getPrice())
                    return 0;
                else
                    return -1;
            }
        };
        Collections.sort(products,a);
    }
}
