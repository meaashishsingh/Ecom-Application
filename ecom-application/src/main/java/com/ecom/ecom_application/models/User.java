package com.ecom.ecom_application.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity(name="User_Table")
//@Entity(name="User_Table") This will create a table User_Table in your database.
//@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private UserRole role= UserRole.CUSTOMER;

    @OneToOne(cascade= CascadeType.ALL,orphanRemoval = true)
    ///adress_id is forign key user_table
    @JoinColumn(name="address_id",referencedColumnName = "id")
    private Address address;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
