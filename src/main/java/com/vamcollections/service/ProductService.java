package com.vamcollections.service;
import com.vamcollections.entity.Product;
import com.vamcollections.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class ProductService {
 private final ProductRepository repo;
 public ProductService(ProductRepository repo){this.repo=repo;}
 public List<Product> all(){return repo.findAll();}
 public Product get(Long id){return repo.findById(id).orElseThrow();}
 public List<Product> search(String q){return q==null||q.isBlank()?repo.findAll():repo.findByNameContainingIgnoreCase(q);}
 public List<Product> category(String c){return repo.findByCategoryIgnoreCase(c);}
 public Product save(Product p){return repo.save(p);}
 public void delete(Long id){repo.deleteById(id);}
}
