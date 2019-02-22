package com.endava.patterns.utils;

import java.util.HashMap;
import java.util.Map;

public class Session {
    private static Session instance;
    private static Map<String, Object> objects;

    private Session() {
        objects = new HashMap<>();
    }

    public static synchronized Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    public void addToMap(String key, Object value) {
        objects.put(key, value);
    }

    public Object getFromMap(String key) {
        return objects.get(key);
    }
}
