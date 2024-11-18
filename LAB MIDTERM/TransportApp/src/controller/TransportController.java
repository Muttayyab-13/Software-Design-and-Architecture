package controller;

import domain.*;
import java.util.ArrayList;
import java.util.List;
import service.TransportService;

import java.util.Scanner;

public class TransportController {
    private final TransportService service;

    public TransportController(TransportService service) {
        this.service = service;
    }

   public void handleRequest() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number of transports:");
    int transportCount = sc.nextInt();
    sc.nextLine(); // Consume newline

    List<Transport> transports = new ArrayList<>();
    for (int i = 0; i < transportCount; i++) {
        System.out.println("Enter transport type (1-University, 2-Public, 3-Own):");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter transport driver name :");
        String id = sc.nextLine();

        System.out.println("Enter capacity:");
        int capacity = sc.nextInt();
        sc.nextLine();

        Transport transport;
        if (type == 1) {
            transport = new UniversityTransport(id, capacity);
        } else if (type == 2) {
            transport = new PublicTransport(id, capacity);
        } else {
            transport = new OwnConvenience(id, capacity);
        }
        transports.add(transport);
    }

    System.out.println("Enter number of passengers:");
    int passengerCount = sc.nextInt();
    sc.nextLine();

    List<Passenger> passengers = new ArrayList<>();
    for (int i = 0; i < passengerCount; i++) {
        System.out.println("Enter passenger name:");
        String name = sc.nextLine();
        passengers.add(new Passenger(name));
    }

    // Assign passengers to transports
    for (int i = 0; i < passengerCount; i++) {
        int transportIndex = i % transportCount; // Round-robin assignment
        service.addPassengerToTransport(transports.get(transportIndex), passengers.get(i));
    }

    // Start all transports
    System.out.println("Starting all transports...");
    for (Transport transport : transports) {
        service.startTransport(transport);
    }

    sc.close();
}

}
