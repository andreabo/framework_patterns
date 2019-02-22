package com.endava.patterns.utils;

import com.endava.patterns.entities.employee.Employee;
import org.springframework.web.client.RestTemplate;

public class HttpRequest {
    private static HttpRequest instance;
    private RestTemplate restTemplate;

    private HttpRequest() {
        restTemplate = new RestTemplate();
    }

    public static synchronized HttpRequest getInstance() {
        if (instance == null) {
            instance = new HttpRequest();
        }
        return instance;
    }

    public Object getFromUri(String URI) {
        return restTemplate.getForEntity(URI, Object.class).getBody();
    }

    public void postFromUri(String URI, Employee object) {
        restTemplate.postForEntity(URI, object, Employee.class);
    }
}
