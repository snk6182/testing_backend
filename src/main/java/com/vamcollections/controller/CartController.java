package com.vamcollections.controller;
import com.vamcollections.entity.CartItem;
import com.vamcollections.repository.CartItemRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/cart") @CrossOrigin(origins="*")
public class CartController {
 private final CartItemRepository repo;
 public CartController(CartItemRepository repo){this.repo=repo;}
 @GetMapping("/{userId}") public List<CartItem> get(@PathVariable Long userId){return repo.findByUserId(userId);}
 @PostMapping public CartItem add(@RequestBody CartItem item){return repo.save(item);}
 @PutMapping("/{id}") public CartItem update(@PathVariable Long id,@RequestBody CartItem item){item.setId(id);return repo.save(item);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){repo.deleteById(id);}
}
