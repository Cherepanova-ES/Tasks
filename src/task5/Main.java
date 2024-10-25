package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HealthMonitoringSystem system = new HealthMonitoringSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register Patient");
            System.out.println("2. Notify Patients");
            System.out.println("3. Show Notifications");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();
                    system.registerPatient(name);
                    break;
                case 2:
                    System.out.print("Enter test result: ");
                    String testResult = scanner.nextLine();
                    system.notifyPatients(testResult);
                    break;
                case 3:
                    System.out.print("Enter patient name to show notifications: ");
                    String patientName = scanner.nextLine();
                    system.showNotifications(patientName);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

