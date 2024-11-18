/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import controller.TransportController;
import service.TransportService;

public class TransportApp {
    public static void main(String[] args) {
        TransportService service = new TransportService();
        TransportController controller = new TransportController(service);
        controller.handleRequest();
    }
}
