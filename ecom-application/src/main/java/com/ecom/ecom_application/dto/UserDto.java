package com.ecom.ecom_application.dto;

import com.ecom.ecom_application.models.UserRole;
import lombok.*;

import java.util.PrimitiveIterator;


@AllArgsConstructor
@NoArgsConstructor

@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private UserRole role= UserRole.CUSTOMER;
    private AddressDto address;

}
