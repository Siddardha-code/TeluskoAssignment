package Telesko.FinindingProductUsingSPRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{place}")
    public Product getProduct(@PathVariable String place) {
        return productService.getProduct(place);
    }

    @GetMapping("/search/{text}")
    public List<Product> getProductWithText(@PathVariable String text) {
        return productService.getProductWithText(text);
    }

    @GetMapping("/warranty/{year}")
    public List<Product> getOutOfWarrantyProducts(@PathVariable int year) {
        return productService.getOutOfWarrantyProducts(year);
    }

    @GetMapping("/place/{place}")
    public List<Product> getProductsWithPlace(@PathVariable String place) {
        return productService.getProductsWithPlace(place);
    }
}

