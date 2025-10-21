package com.ecom.ecom_application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.PrimitiveIterator;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {


    private Long id;
    private String firstName;
    private String lastName;

}
