import java.util.*;
import java.util.stream.Collectors;

class Product {
    String name;
    String category;
    double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
}

public class ProcessProducts {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", "Electronics", 75000),
            new Product("Smartphone", "Electronics", 50000),
            new Product("Table", "Furniture", 10000),
            new Product("Chair", "Furniture", 5000)
        );
      
        Map<String, Optional<Product>> mostExpensiveByCategory = products.stream()
            .collect(Collectors.groupingBy(p -> p.category, Collectors.maxBy(Comparator.comparingDouble(p -> p.price))));
        
        System.out.println("Most Expensive Product per Category:");
        mostExpensiveByCategory.forEach((category, product) -> 
            product.ifPresent(p -> System.out.println(category + ": " + p.name + " (" + p.price + ")")));

        double averagePrice = products.stream()
            .mapToDouble(p -> p.price)
            .average()
            .orElse(0.0);

        System.out.println("\nAverage Price of All Products: " + averagePrice);
    }
}
