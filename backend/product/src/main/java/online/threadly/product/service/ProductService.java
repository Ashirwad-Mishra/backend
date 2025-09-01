package online.threadly.product.service;

import online.threadly.product.model.Product;
import online.threadly.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product){

        return productRepository.save(product);
    }

   public List<Product>getProducts(){
        return productRepository.findAll();
   }

    public Product getProduct(UUID id){
       return productRepository.findById(id).orElse(null);
    }

    public Product getProductBySlug(String slug){
        return productRepository.findBySlug(slug).orElse(null);
    }


}