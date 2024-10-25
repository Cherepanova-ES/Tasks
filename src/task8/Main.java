package task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SettingsManager settingsManager = new SettingsManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Save Settings");
            System.out.println("2. Load Settings");
            System.out.println("3. Show Current Settings");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter player name: ");
                    String playerName = scanner.nextLine();
                    System.out.print("Enter volume (0-100): ");
                    int volume = scanner.nextInt();
                    System.out.print("Fullscreen (true/false): ");
                    boolean fullscreen = scanner.nextBoolean();

                    GameSettings settings = new GameSettings(playerName, volume, fullscreen);
                    settingsManager.saveSettings(settings);
                    break;

                case 2:
                    GameSettings loadedSettings = settingsManager.loadSettings();
                    if (loadedSettings != null) {
                        System.out.println("Loaded Settings: " + loadedSettings);
                    } else {
                        System.out.println("No settings found.");
                    }
                    break;

                case 3:
                    GameSettings currentSettings = settingsManager.loadSettings();
                    if (currentSettings != null) {
                        System.out.println("Current Settings: " + currentSettings);
                    } else {
                        System.out.println("No settings found.");
                    }
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


