package com.vamcollections.repository;
import com.vamcollections.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface CartItemRepository extends JpaRepository<CartItem,Long> {
 List<CartItem> findByUserId(Long userId);
}
