package com.vamcollections.controller;
import com.vamcollections.entity.Category;
import com.vamcollections.repository.CategoryRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/categories") @CrossOrigin(origins="*")
public class CategoryController {
 private final CategoryRepository repo;
 public CategoryController(CategoryRepository repo){this.repo=repo;}
 @GetMapping public List<Category> all(){return repo.findAll();}
}
