import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmergencyRoom er = new EmergencyRoom();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Hospital Emergency Room Dispatcher ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Serve Patient");
            System.out.println("3. Update Severity");
            System.out.println("4. Discharge Patient");
            System.out.println("5. View History");
            System.out.println("6. List Current Patients");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter condition: ");
                    String condition = sc.nextLine();
                    System.out.print("Enter severity (1-10, 1 is most severe): ");
                    int severity = sc.nextInt();
                    er.addPatient(name, age, condition, severity);
                    break;

                case 2:
                    er.servePatient();
                    break;

                case 3:
                    System.out.print("Enter patient name to update: ");
                    String updateName = sc.nextLine();
                    System.out.print("Enter new severity: ");
                    int newSeverity = sc.nextInt();
                    er.updateSeverity(updateName, newSeverity);
                    break;

                case 4:
                    System.out.print("Enter patient name to discharge: ");
                    String dischargeName = sc.nextLine();
                    er.dischargePatient(dischargeName);
                    break;

                case 5:
                    er.viewHistory();
                    break;

                case 6:
                    er.listCurrentPatients();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}