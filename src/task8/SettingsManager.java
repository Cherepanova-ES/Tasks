package task8;

import java.io.*;

public class SettingsManager {
    private static final String SETTINGS_FILE = "game_settings.ser";

    public void saveSettings(GameSettings settings) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SETTINGS_FILE))) {
            oos.writeObject(settings);
            System.out.println("Settings saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public GameSettings loadSettings() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SETTINGS_FILE))) {
            GameSettings settings = (GameSettings) ois.readObject();
            System.out.println("Settings loaded successfully.");
            return settings;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

