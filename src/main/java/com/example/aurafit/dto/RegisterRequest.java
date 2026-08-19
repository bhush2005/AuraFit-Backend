package com.example.aurafit.dto;

import com.example.aurafit.model.UserRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    @NotBlank(message = "Email is Required!")
    @Email(message = "Invalid Email!")
    private String email;

    @NotBlank(message = "Password required")
    private String password;
    private String firstName;
    private String lastName;
    private UserRole role;

}
