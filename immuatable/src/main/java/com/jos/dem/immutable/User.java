package com.jos.dem.immutable;

import java.time.LocalDateTime;
import java.util.Optional;

public class User {
    private final String email;
    private final String password;
    private final boolean active;
    private final Optional<LocalDateTime> lastLogin;

    public User(String email, String password, boolean active, LocalDateTime lastLogin){
        this.email = email;
        this.password = password;
        this.active = active;
        this.lastLogin = Optional.ofNullable(lastLogin);
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public boolean isActive(){
        return active;
    }

    public Optional<LocalDateTime> getLastLogin(){
        return lastLogin;
    }
}