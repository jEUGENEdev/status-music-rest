package com.jeugenedev.status_music.utils;

import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component
public class AlgoEncoder {
    private final MessageDigest sha256 = MessageDigest.getInstance("SHA256");

    public AlgoEncoder() throws NoSuchAlgorithmException {
    }

    public String getSHA256(String src) {
        byte[] hash = sha256.digest(src.getBytes(StandardCharsets.UTF_8));
        return new BigInteger(hash).toString(16);
    }
}
