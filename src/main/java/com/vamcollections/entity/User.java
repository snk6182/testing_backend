package com.vamcollections.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name="app_user")
public class User {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String name;
 @Column(unique=true) private String email;
 private String password;
 private String address;
 private String phone;
}
