package com.vamcollections.controller;
import com.vamcollections.entity.Product;
import com.vamcollections.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/products")
@CrossOrigin(origins="*")
public class ProductController {
 private final ProductService service;
 public ProductController(ProductService service){this.service=service;}
 @GetMapping public List<Product> all(@RequestParam(required=false) String q,@RequestParam(required=false) String category){
  if(category!=null&&!category.isBlank()) return service.category(category);
  return service.search(q);
 }
 @GetMapping("/{id}") public Product get(@PathVariable Long id){return service.get(id);}
 @PostMapping public Product save(@RequestBody Product p){return service.save(p);}
 @PutMapping("/{id}") public Product update(@PathVariable Long id,@RequestBody Product p){p.setId(id);return service.save(p);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){service.delete(id);}
}
