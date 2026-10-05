package com.vamcollections.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class CartItem {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private Long userId;
 private Long productId;
 private int quantity;
}
