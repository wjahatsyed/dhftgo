package com.dhftgo.auth_service.service;

import com.dhftgo.auth_service.dto.RegisterRequest;
import com.dhftgo.auth_service.model.AuthProvider;
import com.dhftgo.auth_service.model.User;
import com.dhftgo.auth_service.repository.UserRepository;
import com.dhftgo.auth_service.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public String register(RegisterRequest request) {
        if ((request.getEmail() == null || request.getEmail().isBlank()) &&
                (request.getPhone() == null || request.getPhone().isBlank())) {
            throw new IllegalArgumentException("Either email or phone must be provided.");
        }

        if (request.getEmail() != null && userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email already registered");
        }

        if (request.getPhone() != null && userRepository.findByPhone(request.getPhone()).isPresent()) {
            throw new IllegalArgumentException("Phone number already registered");
        }

        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .phone(request.getPhone())
                .password(passwordEncoder.encode(request.getPassword()))
                .type(request.getUserType())
                .role(request.getRole())
                .provider(AuthProvider.LOCAL)
                .verified(false)
                .build();

        userRepository.save(user);

        return jwtUtil.generateToken(user.getEmail() != null ? user.getEmail() : user.getPhone());
    }
}
