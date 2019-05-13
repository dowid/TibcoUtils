package com.tibco.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertTrue;

public class passwordUtilsTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(passwordUtilsTest.class);

    String pass = "Hello";

    @org.junit.Test
    public void decryptTibcoPassword() {
        String encryptedPassword = passwordUtils.encryptTibcoPassword(pass.toCharArray());
        LOGGER.debug(" encrypted password: " + encryptedPassword);
        String decryptedPassword = passwordUtils.decryptTibcoPassword(encryptedPassword);
        LOGGER.debug(" decrypted password: " + decryptedPassword);

        assertTrue(pass.equals(decryptedPassword));
    }
}