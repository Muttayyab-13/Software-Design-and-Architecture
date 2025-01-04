/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documentsyncapp;

/**
 *
 * @author WORK
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SyncApplication {

    public static void main(String[] args) {
        // Create an ExecutorService with a thread pool to handle async tasks
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Create an instance of the DocumentSyncService
        DocumentSyncService syncService = new DocumentSyncService();

        // Simulate syncing tasks for multiple users
        executorService.submit(() -> syncService.syncDocuments("User123"));
        executorService.submit(() -> syncService.syncDocuments("User456"));
        executorService.submit(() -> syncService.syncDocuments("User789"));

        // Shut down the ExecutorService after all tasks are submitted
        executorService.shutdown();
    }
}
