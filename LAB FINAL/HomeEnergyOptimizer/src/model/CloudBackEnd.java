/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author My University
 */
public class CloudBackEnd {
    public void processData(String data) {
        System.out.println("Processing data: " + data);
    }

    public void analyzeEnergyUsage() {
        System.out.println("Analyzing energy usage...");
    }

    public void sendCommandToDevice(IoTDevice device, String command) {
        System.out.println("Sending command to device " + device.getDeviceId() + ": " + command);
        device.setStatus(command);
    }
}

