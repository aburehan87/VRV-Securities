package com.skillcapital.jwt;


import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class TokenBlacklistService {

    private final Set<String> blacklist = new HashSet<>();

    // Add a token to the blacklist
    public void addToBlacklist(String token) {
        blacklist.add(token);
    }

    // Check if a token is blacklisted
    public boolean isBlacklisted(String token) {
        return blacklist.contains(token);
    }
}
