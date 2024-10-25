package task5;

import java.util.HashMap;
import java.util.Map;

public class HealthMonitoringSystem {
    private Map<String, Patient> patients;

    public HealthMonitoringSystem() {
        patients = new HashMap<>();
    }

    public void registerPatient(String name) {
        if (!patients.containsKey(name)) {
            patients.put(name, new Patient(name));
            System.out.println("Patient " + name + " registered successfully.");
        } else {
            System.out.println("Patient " + name + " is already registered.");
        }
    }

    public void notifyPatients(String testResult) {
        for (Patient patient : patients.values()) {
            patient.addNotification("New test result: " + testResult);
            System.out.println("Notification sent to " + patient.getName());
        }
    }

    public void showNotifications(String patientName) {
        Patient patient = patients.get(patientName);
        if (patient != null) {
            System.out.println("Notifications for " + patientName + ":");
            for (String notification : patient.getNotifications()) {
                System.out.println(notification);
            }
        } else {
            System.out.println("Patient not found.");
        }
    }
}
