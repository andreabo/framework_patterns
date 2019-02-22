package com.endava.patterns.utils;

import org.springframework.web.client.RestTemplate;

public class HttpRequest {
    public Object getFromUri(String URI) {
        return new RestTemplate().getForEntity(URI, Object.class).getBody();
    }
}
