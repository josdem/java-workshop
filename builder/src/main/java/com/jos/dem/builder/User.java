package com.jos.dem.builder;

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
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public boolean isActive(){
        return this.active;
    }

    public Optional<LocalDateTime> getLastLogin(){
        return this.lastLogin;
    }

    public static class Builder {

        private final String email;
        private final String password;
        private boolean active;
        private LocalDateTime lastLogin;

        public Builder(String email,
                           String password) {
            this.email = email;
            this.password = password;
        }

        public Builder active(boolean active) {
            this.active = active;
            return this;
        }

        public Builder lastLogin(LocalDateTime lastLogin) {
            this.lastLogin = lastLogin;
            return this;
        }

        public User build() {
            return new User(this.email,
                            this.password,
                            this.active,
                            this.lastLogin);
        }
    }
}