package com.spring.jwt2.utils;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

/**
 * KeyGeneratorUtil
 */
public class KeyGeneratorUtil {

    public static KeyPair generateKeyPair() {
        KeyPair keyPair;
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            keyPair = keyPairGenerator.generateKeyPair();
        } catch (Exception e) {
            throw new IllegalStateException();
        }
        return keyPair;
    }
}