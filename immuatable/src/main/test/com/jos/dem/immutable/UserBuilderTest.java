package com.jos.dem.immutable;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.DisplayName;

class UserBuilderTest {

    @Test
    @DisplayName("should create basic user")
    void shouldCreateBasicUser() {
        User user = new UserBuilder("josdem@email.com", "password")
            .active(true)
            .build();
            
        assertEquals("josdem@email.com", user.getEmail(), "should have email");
        assertEquals("password", user.getEmail(), "should have password");
    }
}