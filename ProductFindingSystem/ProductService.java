package Telesko.ProductFindingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getAllProducts(){
        return products;
    }

        //To find a specific product with name..
        public Product getProduct(String place) {
            return products.stream()
                    //.filter(p -> p.getName().equals(name))
                    .filter(p -> p.getPlace().equals(place))
                    .findFirst()
                    .orElse(null);
                }

    //To find a product with specific text in it...
    public List<Product> getProductWithText(String text) {
    String str = text.toLowerCase();

    return products.stream()
            .filter(p -> {
                String name = p.getName().toLowerCase();
                String type = p.getType().toLowerCase();
                String place = p.getPlace().toLowerCase();
                return name.contains(str) || type.contains(str) || place.contains(str);
            })
            .collect(Collectors.toList());
}

    // public Product getProduct(int warranty) {
    //     for (Product p : products) {
    //         if (p.getWarranty() < warranty)
    //             return p;
    //     }
    //     return null;
    // }

    //To find products with out of warranty..
    public List<Product> getOutOfWarrantyProducts(int WarrantyYear) {
        return products.stream()
                .filter(p -> p.getWarranty() < WarrantyYear)
                .collect(Collectors.toList());
    }

    //To find products with in specific place...
    public List<Product> getProductsWithPlace(String place) {
        return products.stream()
                .filter(p -> p.getPlace().equals(place))
                .collect(Collectors.toList());
    }

}
