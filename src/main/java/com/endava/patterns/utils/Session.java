package com.endava.patterns.utils;

import java.util.HashMap;
import java.util.Map;

public class Session {
    private static Map<String, Object> objects;

    public Session() {
        objects = new HashMap<>();
    }

    public void addToMap(String key, Object value) {
        objects.put(key, value);
    }

    public Object getFromMap(String key) {
        return objects.get(key);
    }
}
