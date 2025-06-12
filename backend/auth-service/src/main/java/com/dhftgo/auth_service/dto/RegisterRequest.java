package com.dhftgo.auth_service.dto;

import com.dhftgo.auth_service.model.Role;
import com.dhftgo.auth_service.model.UserType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRequest {
    private String name;
    private String email;
    private String phone;
    private String password;
    private UserType userType;
    private Role role;
}
