/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author My University
 */

public class OwnConvenience extends Transport {
    public OwnConvenience(String id, int capacity) {
        super(id, capacity);
    }

    @Override
    public void start() {
        notifyPassengers("Own convenience " + id + " is leaving.");
    }
}

