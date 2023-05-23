import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsWithText(String text) {
        return productRepository.findByNameContainingIgnoreCase(text);
    }

    public List<Product> getOutOfWarrantyProducts(int warrantyYear) {
        return productRepository.findByWarrantyLessThan(warrantyYear);
    }
}
