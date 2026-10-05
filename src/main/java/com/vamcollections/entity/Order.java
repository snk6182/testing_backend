package com.vamcollections.entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name="customer_order")
public class Order {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private Long userId;
 private double totalAmount;
 private String status;
 private LocalDateTime orderDate;
}
