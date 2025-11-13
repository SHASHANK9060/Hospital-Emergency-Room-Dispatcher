import java.util.*;

public class EmergencyRoom {
    private PriorityQueue<Patient> patientQueue;
    private Map<String, Patient> patientMap;
    private List<Patient> dischargedPatients;

    public EmergencyRoom() {
        patientQueue = new PriorityQueue<>();
        patientMap = new HashMap<>();
        dischargedPatients = new ArrayList<>();
    }

    public void addPatient(String name, int age, String condition, int severity) {
        Patient patient = new Patient(name, age, condition, severity);
        patientQueue.add(patient);
        patientMap.put(name.toLowerCase(), patient);
        System.out.println("Patient added: " + patient);
    }

    public void servePatient() {
        if (patientQueue.isEmpty()) {
            System.out.println("No patients to serve.");
            return;
        }

        Patient patient = patientQueue.poll();
        dischargedPatients.add(patient);
        patientMap.remove(patient.getName().toLowerCase());
        System.out.println("Serving patient: " + patient);
    }

    public void updateSeverity(String name, int newSeverity) {
        name = name.toLowerCase();
        if (!patientMap.containsKey(name)) {
            System.out.println("Patient not found.");
            return;
        }

        Patient oldPatient = patientMap.get(name);
        patientQueue.remove(oldPatient); // PriorityQueue doesn't support direct update
        oldPatient.setSeverity(newSeverity);
        patientQueue.add(oldPatient);

        System.out.println("Updated severity: " + oldPatient);
    }

    public void dischargePatient(String name) {
        name = name.toLowerCase();
        if (!patientMap.containsKey(name)) {
            System.out.println("Patient not found.");
            return;
        }

        Patient patient = patientMap.get(name);
        patientQueue.remove(patient);
        dischargedPatients.add(patient);
        patientMap.remove(name);
        System.out.println("Patient discharged: " + patient);
    }

    public void viewHistory() {
        if (dischargedPatients.isEmpty()) {
            System.out.println("No discharge history.");
            return;
        }

        System.out.println("Discharged/Served Patients:");
        for (Patient p : dischargedPatients) {
            System.out.println(p);
        }
    }

    public void listCurrentPatients() {
        if (patientQueue.isEmpty()) {
            System.out.println("No current patients.");
            return;
        }

        System.out.println("Current Patients in Queue:");
        for (Patient p : patientQueue) {
            System.out.println(p);
        }
    }
}