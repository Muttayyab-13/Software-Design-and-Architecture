/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author My University
 */
public class IoTDevice {
    private int deviceId;
    private String type;
    private String status;
    private float energyConsumption;

    // Constructor
    public IoTDevice(int deviceId, String type, String status, float energyConsumption) {
        this.deviceId = deviceId;
        this.type = type;
        this.status = status;
        this.energyConsumption = energyConsumption;
    }

    // Getters and Setters
    public int getDeviceId() { return deviceId; }
    public void setDeviceId(int deviceId) { this.deviceId = deviceId; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public float getEnergyConsumption() { return energyConsumption; }
    public void setEnergyConsumption(float energyConsumption) { this.energyConsumption = energyConsumption; }
}

