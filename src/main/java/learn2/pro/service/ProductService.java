package learn2.pro.service;



import learn2.pro.domain.Product;
import learn2.pro.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }


    public Optional<Product> getProductById(String model) {
        return productRepository.findById(model);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(String model) {
        productRepository.deleteById(model);
    }
}
