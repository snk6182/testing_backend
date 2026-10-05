package com.vamcollections.controller;
import com.vamcollections.entity.Order;
import com.vamcollections.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;
@RestController @RequestMapping("/api/orders") @CrossOrigin(origins="*")
public class OrderController {
 private final OrderRepository repo;
 public OrderController(OrderRepository repo){this.repo=repo;}
 @PostMapping public Order create(@RequestBody Order order){
  order.setOrderDate(LocalDateTime.now());
  order.setStatus("PLACED");
  return repo.save(order);
 }
 @GetMapping("/user/{userId}") public List<Order> userOrders(@PathVariable Long userId){return repo.findByUserIdOrderByOrderDateDesc(userId);}
 @GetMapping("/{id}") public Order get(@PathVariable Long id){return repo.findById(id).orElseThrow();}
}
