package documentsyncapp;

import java.util.concurrent.TimeUnit;

public class DocumentSyncService {

    // Method to simulate syncing documents for a user
    public void syncDocuments(String userId) {
        try {
            System.out.println("Starting sync for user: " + userId);
            TimeUnit.SECONDS.sleep(5);  // Simulating a long-running task (5 seconds delay)
            System.out.println("Sync completed for user: " + userId);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
