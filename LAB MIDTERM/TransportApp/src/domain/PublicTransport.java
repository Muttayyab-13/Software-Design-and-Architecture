package domain;

public class PublicTransport extends Transport {
    public PublicTransport(String id, int capacity) {
        super(id, capacity);
    }

    public boolean validateTiming() {
        System.out.println("Validating timing for public transport " + id);
        return true;
    }

    @Override
    public void start() {
        if (validateTiming()) {
            notifyPassengers("Public transport " + id + " is leaving.");
        }
    }
}
