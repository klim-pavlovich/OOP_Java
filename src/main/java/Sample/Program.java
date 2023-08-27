package Sample;

import ru.geekbrains.oop.seminar1.Product;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product("ProductName1", "ProductBrand", 200);
        System.out.println(product1.displayInfo());
    }
}
