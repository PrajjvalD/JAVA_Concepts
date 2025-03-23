package com.collection.maps;

import java.util.*;
import java.io.*;

public class PropertiesHashtableBasics {

    public static void propertiesHashtableOperations() {
        // Creating a Properties object (which extends Hashtable)
        Properties properties = new Properties();

        // 1. Adding Key-Value Pairs (Using Hashtable Methods)
        properties.put("username", "admin");
        properties.put("password", "12345");
        properties.put("database", "test_db");
        properties.put("host", "localhost");
        System.out.println("Properties Hashtable after adding elements: " + properties);

        // 2. Getting Values
        System.out.println("Username: " + properties.get("username"));
        System.out.println("Password: " + properties.get("password"));

        // 3. Checking if a Key Exists
        System.out.println("Contains 'host' key? " + properties.containsKey("host"));

        // 4. Checking if a Value Exists
        System.out.println("Contains 'test_db' value? " + properties.containsValue("test_db"));

        // 5. Iterating through Properties using Enumeration
        System.out.println("\nIterating through Properties Hashtable:");
        Enumeration<Object> keys = properties.keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            System.out.println(key + " -> " + properties.get(key));
        }

        // 6. Storing Properties to a File
        try (FileOutputStream fos = new FileOutputStream("config.properties")) {
            properties.store(fos, "Database Configuration");
            System.out.println("\nProperties saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 7. Loading Properties from a File
        Properties loadedProperties = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            loadedProperties.load(fis);
            System.out.println("\nProperties loaded from file: " + loadedProperties);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 8. Cloning the Properties Object
        Properties clonedProperties = (Properties) properties.clone();
        System.out.println("\nCloned Properties Hashtable: " + clonedProperties);

        // 9. Removing a Key
        properties.remove("password");
        System.out.println("\nProperties Hashtable after removing 'password': " + properties);

        // 10. Clearing the Properties
        properties.clear();
        System.out.println("Properties Hashtable after clear(): " + properties);
    }

    public static void main(String[] args) {
        propertiesHashtableOperations();
    }
}
