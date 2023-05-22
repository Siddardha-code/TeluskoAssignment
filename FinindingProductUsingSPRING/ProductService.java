package Telesko.FinindingProductUsingSPRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProduct(String place) {
        return productRepository.findByPlace(place);
    }

    public List<Product> getProductWithText(String text) {
        return productRepository.findByNameContainingIgnoreCaseOrTypeContainingIgnoreCaseOrPlaceContainingIgnoreCase(text, text, text);
    }

    public List<Product> getOutOfWarrantyProducts(int warrantyYear) {
        return productRepository.findByWarrantyLessThan(warrantyYear);
    }

    public List<Product> getProductsWithPlace(String place) {
        return productRepository.findByPlace(place);
    }
}
