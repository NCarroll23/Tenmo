package com.techelevator.tenmo.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    public User testUser = new User();


    @Test
    void getAccountId() {
        testUser.setAccountId(5);
        assertEquals(5, testUser.getAccountId());
    }

    @Test
    void getId() {
        testUser.setId(5L);
        assertEquals(5L, testUser.getId());
    }

    @Test
    void getUsername() {
        testUser.setUsername("testUser");
        assertEquals("testUser", testUser.getUsername());

    }
}