/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.CloudBackEnd;
import model.IoTDevice;
import model.User;
import view.MobileAppView;

/**
 *
 * @author My University
 */
public class AppController {
    private User user;
    private MobileAppView view;
    private CloudBackEnd backend;

    public AppController(User user, MobileAppView view, CloudBackEnd backend) {
        this.user = user;
        this.view = view;
        this.backend = backend;
    }

    public void loginUser(String email, String password) {
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            System.out.println("Login successful for user: " + user.getName());
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }
    }

    public void monitorEnergyUsage() {
        backend.analyzeEnergyUsage();
        view.displayEnergyUsage("120 kWh this month");
    }

    public void controlDevice(IoTDevice device, String command) {
        backend.sendCommandToDevice(device, command);
        System.out.println("Device " + device.getDeviceId() + " status updated to: " + device.getStatus());
    }
}

