/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    protected String id;
    protected int capacity;
    protected List<Passenger> passengers = new ArrayList<>();

    public Transport(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public void addPassenger(Passenger p) {
        if (passengers.size() < capacity) {
            passengers.add(p);
            System.out.println(p.getName() + " added to " + id);
        } else {
            notifyPassengers("Transport full!");
        }
    }

    public void notifyPassengers(String msg) {
        for (Passenger p : passengers) {
            p.update(msg);
        }
    }

    public abstract void start();
}

