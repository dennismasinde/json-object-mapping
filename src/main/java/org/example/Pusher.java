package org.example;

public class Pusher {
    private String name;
    private String email;

    public Pusher() {
        super();
    }

    @Override
    public String toString() {
        return "Pusher{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // Getter Methods

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Setter Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
