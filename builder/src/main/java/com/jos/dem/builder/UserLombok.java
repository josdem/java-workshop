package com.jos.dem.builder;

import java.time.LocalDateTime;
import java.util.Optional;

import lombok.Getter;
import lombok.Builder;

@Getter
@Builder(builderMethodName = "requiredBuilder")
public class UserLombok {
    private final String email;
    private final String password;
    private final boolean active;
    private final Optional<LocalDateTime> lastLogin;

    public static UserLombokBuilder builder(String email, String password){
        return requiredBuilder()
                .email(email)
                .password(password);
    }
}