package service;

import domain.Transport;
import domain.Passenger;

public class TransportService {
    public void startTransport(Transport transport) {
        transport.start();
    }

    public void addPassengerToTransport(Transport transport, Passenger passenger) {
        transport.addPassenger(passenger);
    }
}
