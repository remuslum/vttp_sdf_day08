

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Date date = new Date();
        List<Product> productList = new ArrayList<>();
        
        Product mouse = new Product(date, 1, 99.0f, "Computer", "For click UI on screen", "Mouse");
        Product keyboard = new Product(date, 2, 235.5f,"Computer", "Device that allows alpha numeric inputs", "Keyboard");
        Product monitor = new Product(date, 3, 157.5f, "Computer", "Extended display monitor", "15.6 inch monitor");
        Product huaweiPura70 = new Product(date, 4, 900.0f, "Mobile", "Huawei phone", "Huawei Pura 70 Ultra");
        Product huaweiMate50 = new Product(date, 5, 1200.0f, "Mobile", "Huawei phone", "Huawei Mate 50 Pr");
        Product iPhone16Pro = new Product(date, 6, 2000.0f, "Mobile", "iPhone", "iPhone 16 Pro");
        Product iPhone14Pro = new Product(date, 7, 1800.0f, "Mobile", "iPhone", "iPhone 14 Pro");

        productList.add(mouse);
        productList.add(keyboard);
        productList.add(monitor);
        productList.add(huaweiPura70);
        productList.add(huaweiMate50);
        productList.add(iPhone14Pro);
        productList.add(iPhone16Pro);

        List<Product> result = productList.stream().filter(p -> p.getProductCategory().equals("Mobile") && p.getPrice() > 1500.0f).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
