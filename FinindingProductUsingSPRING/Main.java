import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProductSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);

		ProductService productService = context.getBean(ProductService.class);

		// Get all products
		List<Product> products = productService.getAllProducts();
		for (Product product : products) {
			System.out.println(product);
		}

		System.out.println("--------------------------------------------------");

		// Get products out of warranty
		int warrantyYear = 2023;
		List<Product> outOfWarrantyProducts = productService.getOutOfWarrantyProducts(warrantyYear);
		for (Product product : outOfWarrantyProducts) {
			System.out.println(product);
		}

		System.out.println("--------------------------------------------------");

		// Get products with specific text
		String searchText = "black";
		List<Product> productsWithText = productService.getProductsWithText(searchText);
		for (Product product : productsWithText) {
			System.out.println(product);
		}
	}
}
