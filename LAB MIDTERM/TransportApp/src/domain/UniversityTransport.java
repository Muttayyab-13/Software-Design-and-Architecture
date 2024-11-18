package domain;

public class UniversityTransport extends Transport {
    public UniversityTransport(String id, int capacity) {
        super(id, capacity);
    }

    public boolean validateAdvancePayment() {
        System.out.println("Validating advance payment for " + id);
        return true;
    }

    @Override
    public void start() {
        if (validateAdvancePayment()) {
            notifyPassengers("University transport " + id + " is leaving.");
        }
    }
}
