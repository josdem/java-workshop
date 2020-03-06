package com.jos.dem.builder;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserLombokBuilderTest {

    @Test
    @DisplayName("should create basic user")
    void shouldCreateBasicUser() {
        UserLombok user = UserLombok.builder("josdem@email.com", "password")
            .build();

        assertEquals("josdem@email.com", user.getEmail(), "should have email");
        assertEquals("password", user.getPassword(), "should have password");
        assertFalse(user.isActive(), "should not be active");
    }

    @Test
    @DisplayName("should create an active user")
    void shouldCreateActiveUser() {
        UserLombok user = UserLombok.builder("josdem@email.com", "password")
            .active(true)
            .build();

        assertEquals("josdem@email.com", user.getEmail(), "should have email");
        assertEquals("password", user.getPassword(), "should have password");
        assertTrue(user.isActive(), "should be active");
    }

    @Test
    @DisplayName("should create an active user with last login date")
    void shouldCreateUserWithLastLoginTime() {
        UserLombok user = UserLombok.builder("josdem@email.com", "password")
            .active(true)
            .lastLogin(Optional.of(LocalDateTime.now()))
            .build();

        assertEquals("josdem@email.com", user.getEmail(), "should have email");
        assertEquals("password", user.getPassword(), "should have password");
        assertTrue(user.isActive(), "should be active");
        assertTrue(LocalDateTime.now().compareTo(user.getLastLogin().get()) > 0, "should be active");
    }

}