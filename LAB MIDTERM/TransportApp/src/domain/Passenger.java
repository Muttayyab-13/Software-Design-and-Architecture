/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author My University
 */

public class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void update(String msg) {
        System.out.println(name + ": " + msg);
    }

    public String getName() {
        return name;
    }
}

