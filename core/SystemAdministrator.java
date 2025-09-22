package com.rescueapp.core;

public class SystemAdministrator extends User {
    public SystemAdministrator() { }

    public SystemAdministrator(String id, String name, String email) {
        super(id, name, email, "Admin");
    }

    public void manageUser() {
    	
    }
    public void manageVolunteer() { }
    public void manageNGO() { }
    public void manageStrayAnimal() { }
    public void manageReport() { }
    public void manageAdoptionRequest() { }
    public void manageTask() { }
}
