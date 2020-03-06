package com.jos.dem.immutable;

import java.time.LocalDateTime;
import java.util.Optional;

public class UserBuilder {

    private final String email;
    private final String password;
    private boolean active;
    private LocalDateTime lastLogin;

    public UserBuilder(String email,
                       String password) {
        this.email = email;
        this.password = password;
    }

    public UserBuilder active(boolean active) {
        this.active = active;
        return this;
    }

    public UserBuilder lastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
        return this;
    }

    public User build() {
        return new User(this.email,
                        this.password,
                        this.active,
                        Optional.ofNullable(this.lastLogin));
    }
}