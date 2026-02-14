package com.example.selenium;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class LocatorStore {
    private static final Path STORE_PATH = Paths.get(System.getProperty("user.dir"), "locator-store.json");
    private static final Gson GSON = new Gson();
    private static Map<String, String> store = new HashMap<>();

    static {
        load();
    }

    private static synchronized void load() {
        try {
            if (Files.exists(STORE_PATH)) {
                String json = Files.readString(STORE_PATH);
                Type t = new TypeToken<Map<String, String>>(){}.getType();
                store = GSON.fromJson(json, t);
                if (store == null) store = new HashMap<>();
            } else {
                // No external locator JSON provided: page objects provide default locators at runtime.
                store = new HashMap<>();
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to load locator store", e);
        }
    }

    public static synchronized String get(String key) {
        return store.get(key);
    }

    public static synchronized void put(String key, String xpath) {
        store.put(key, xpath);
        save();
    }

    private static synchronized void save() {
        try {
            String json = GSON.toJson(store);
            Files.writeString(STORE_PATH, json);
        } catch (IOException e) {
            throw new RuntimeException("Failed to save locator store", e);
        }
    }
}