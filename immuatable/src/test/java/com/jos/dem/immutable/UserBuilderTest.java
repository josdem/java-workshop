package com.jos.dem.immutable;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserBuilderTest {

    @Test
    @DisplayName("should create basic user")
    void shouldCreateBasicUser() {
        User user = new UserBuilder("josdem@email.com", "password")
            .active(true)
            .build();

        assertEquals("josdem@email.com", user.getEmail(), "should have email");
        assertEquals("password", user.getPassword(), "should have password");
    }
}