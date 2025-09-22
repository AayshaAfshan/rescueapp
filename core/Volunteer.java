package com.rescueapp.core;

public class Volunteer extends User {
    public Volunteer() {
    	
    }

    public Volunteer(String id, String name, String email) {
        super(id, name, email, "Volunteer");
    }
}