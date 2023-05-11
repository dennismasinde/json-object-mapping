package org.example;

import java.util.ArrayList;
import java.util.List;

public class Home {
    private String address;
    private float cost;
    ArrayList <Pet> pets = new ArrayList <> ();

    public Home() {
        super();
    }

    // Getter Methods

    public String getAddress() {
        return address;
    }

    public float getCost() {
        return cost;
    }

    // Setter Methods

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Home{" +
                "address='" + address + '\'' +
                ", cost=" + cost +
                ", pets=" + pets +
                '}';
    }
}
