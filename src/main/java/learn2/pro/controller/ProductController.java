package learn2.pro.controller;

import learn2.pro.domain.Product;
import learn2.pro.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/{model}")
    public Optional<Product> getProductByModel(@PathVariable String model) {
        return productService.getProductById(model);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PutMapping("/{model}")
    public Product updateProduct(@PathVariable String model, @RequestBody Product productDetails) {
        Optional<Product> productOptional = productService.getProductById(model);
        if (productOptional.isPresent()) {
            Product product = productOptional.get();
            product.setModel(productDetails.getModel());
            product.setProductName(productDetails.getProductName());
            product.setProductPrice(productDetails.getProductPrice());
            product.setProductStock(productDetails.getProductStock());
            product.setSupID(productDetails.getSupID());

            return productService.saveProduct(product);
        } else {
            throw new RuntimeException("Product not found with model: " + model);
        }
    }

    @DeleteMapping("/{model}")
    public void deleteProduct(@PathVariable String model) {
        productService.deleteProduct(model);
    }
}
