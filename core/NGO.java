package com.rescueapp.core;

public class NGO extends User {
    public NGO() { }

    public NGO(String id, String name, String email) {
        super(id, name, email, "NGO");
    }
}
