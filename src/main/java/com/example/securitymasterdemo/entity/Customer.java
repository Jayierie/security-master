package com.example.securitymasterdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Code cannot be empty!")
    @Size(min = 2,max = 5,message = "code must be between 2 and 5.")
    @Pattern(regexp = "[A-Za-z]*",message = "Code cannot contain illegal characters.")
    private String code;

    @NotBlank(message = "First Name cannot be blank.")
    @Pattern(regexp = "[A-Za-z-]*",message = "First Name cannot contain illegal characters.")
    private String firstName;

    @NotBlank(message = "First Name cannot be blank.")
    @Pattern(regexp = "[A-Za-z-]*",message = "Last Name cannot contain illegal characters.")
    private String lastName;

    @NotBlank(message = "First Name cannot be blank.")
    @Pattern(regexp = "[\\w .\\-/,]*",message = "Address cannot contain illegal characters.")
    private String address;

}
