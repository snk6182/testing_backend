package com.vamcollections.controller;
import com.vamcollections.entity.User;
import com.vamcollections.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/auth") @CrossOrigin(origins="*")
public class AuthController {
 private final UserRepository repo;
 public AuthController(UserRepository repo){this.repo=repo;}
 @PostMapping("/register") public User register(@RequestBody User u){return repo.save(u);}
 @PostMapping("/login") public User login(@RequestBody User request){
  return repo.findByEmail(request.getEmail()).filter(u->u.getPassword().equals(request.getPassword()))
   .orElseThrow(()->new RuntimeException("Invalid email or password"));
 }
}
