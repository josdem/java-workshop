package com.jos.dem.immutable;

import java.time.LocalDateTime;
import java.util.Optional;

import lombok.Getter;
import lombok.Builder;

@Getter
@Builder
public class UserLombok {
    private final String email;
    private final String password;
    private final boolean active;
    private final Optional<LocalDateTime> lastLogin;
}