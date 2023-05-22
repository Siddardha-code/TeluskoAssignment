The above project is a product finding system built using Spring Boot and Spring Data JPA. 
It helps users locate their misplaced or forgotten items within a house. 
The project leverages the power of the Stream API for filtering products based on specific criteria such as name, type, or place.

The main file, Main.java, showcases the functionality of the project. 
It demonstrates the addition of products to the system using the ProductService class. 
Users can add products with details like name, type, place, and warranty year.

The project provides several features for finding products. 
The getProductWithText method allows users to search for products based on a specific text in their names, types, or places. 
The getProduct method retrieves a particular product by its place. Additionally, 
the getOutOfWarrantyProducts method helps users find products that are out of warranty based on a specified year.

The code follows encapsulation principles, with the Product class containing private fields and providing public getter and setter methods. 
The ProductService class encapsulates the business logic and performs CRUD operations on products using the ProductRepository.
