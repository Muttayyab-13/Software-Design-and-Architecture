/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import controller.AppController;
import model.CloudBackEnd;
import model.IoTDevice;
import model.User;
import view.MobileAppView;

/**
 *
 * @author My University
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Model
User user = new User(1, "Muttayyab", "muttayyab@123", "1234");
        IoTDevice smartBulb = new IoTDevice(101, "Smart Bulb", "Off", 15.5f);
        CloudBackEnd backend = new CloudBackEnd();

        // Create View
        MobileAppView view = new MobileAppView();

        // Create Controller
        AppController controller = new AppController(user, view, backend);

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Menu loop
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Login User");
            System.out.println("2. Monitor Energy Usage");
            System.out.println("3. Control Device");
            System.out.println("4. Exit");

            System.out.print("Choose an option (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    // Login User
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    controller.loginUser(email, password);
                    break;

                case 2:
                    // Monitor Energy Usage
                    controller.monitorEnergyUsage();
                    break;

                case 3:
                    // Control Device
                    System.out.print("Enter device ID to control (e.g., 101): ");
                    int deviceId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    System.out.print("Enter command (On/Off): ");
                    String command = scanner.nextLine();
                    
                    // Find the device (in this case, only one device, smartBulb)
                    if (deviceId == smartBulb.getDeviceId()) {
                        controller.controlDevice(smartBulb, command);
                    } else {
                        System.out.println("Device not found.");
                    }
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}
