# 🏥 Hospital Emergency Room Dispatcher – Java Console Application

This project simulates a hospital emergency room system using core Java. Patients are handled based on medical severity (lower severity number = higher priority). It supports adding, serving, discharging patients, updating severity, and viewing patient history.

---

## ✅ Features

- ➕ **Add Patient** – Add a patient with name, age, condition, and severity.
- 🚑 **Serve Patient** – Serve the patient with the highest priority (lowest severity).
- ⚠️ **Update Severity** – Update a patient’s severity level.
- ❌ **Discharge Patient** – Discharge a specific patient.
- 📜 **View History** – See the list of discharged/served patients.
- 📋 **List Current Patients** – View the patients currently in the emergency queue.

---

## 🧠 Data Structures Used

| Data Structure   | Use Case                                   |
|------------------|---------------------------------------------|
| `PriorityQueue`  | Maintain patients based on severity level   |
| `HashMap`        | Quick lookup of patients by name            |
| `ArrayList`      | Keep history of discharged/served patients  |

---

## 📂 File Structure

HospitalER/
├── Patient.java # Patient model class (with Comparable)
├── EmergencyRoom.java # Business logic and data handling
└── Main.java # Console menu and user input

### 🔧 Prerequisites
- Java 8 or higher installed
- IDE (VS Code, IntelliJ, Eclipse) or terminal

### 🚀 Steps

1. Open a terminal and navigate to the folder containing the `.java` files.
2. Compile all files:
   ```bash
   javac *.java
3. Run the application:
   java Main



#### Sample run 


PS C:\Users\hp\OneDrive\Desktop\PROJECTS\HospitalER> Javac *.Java
PS C:\Users\hp\OneDrive\Desktop\PROJECTS\HospitalER> Java Main

--- Hospital Emergency Room Dispatcher ---
1. Add Patient
2. Serve Patient
3. Update Severity
4. Discharge Patient
5. View History
6. List Current Patients
0. Exit
Enter your choice: 1
Enter name: Ajith
Enter age: 20
Enter condition: headche
Enter severity (1-10, 1 is most severe): 4
Patient added: Name: Ajith, Age: 20, Condition: headche, Severity: 4

--- Hospital Emergency Room Dispatcher ---
1. Add Patient
2. Serve Patient
3. Update Severity
4. Discharge Patient
5. View History
6. List Current Patients
0. Exit
Enter your choice: 6
Current Patients in Queue:
Name: Ajith, Age: 20, Condition: headche, Severity: 4

--- Hospital Emergency Room Dispatcher ---
1. Add Patient
2. Serve Patient
3. Update Severity
4. Discharge Patient
5. View History
6. List Current Patients
0. Exit
Enter your choice: 4
Enter patient name to discharge: Ajith
Patient discharged: Name: Ajith, Age: 20, Condition: headche, Severity: 4

--- Hospital Emergency Room Dispatcher ---
1. Add Patient
2. Serve Patient
3. Update Severity
4. Discharge Patient
5. View History
6. List Current Patients
0. Exit
Enter your choice: 1
Enter name: Sonu
Enter age: 24
Enter condition: stomach pain
Enter severity (1-10, 1 is most severe): 6
Patient added: Name: Sonu, Age: 24, Condition: stomach pain, Severity: 6

--- Hospital Emergency Room Dispatcher ---
1. Add Patient
2. Serve Patient
3. Update Severity
4. Discharge Patient
5. View History
6. List Current Patients
0. Exit
Enter your choice: 2
Serving patient: Name: Sonu, Age: 24, Condition: stomach pain, Severity: 6

--- Hospital Emergency Room Dispatcher ---
1. Add Patient
2. Serve Patient
3. Update Severity
4. Discharge Patient
5. View History
6. List Current Patients
0. Exit
Enter your choice: 3
Enter patient name to update: sonu
Enter new severity: 1
Patient not found.

--- Hospital Emergency Room Dispatcher ---
1. Add Patient
2. Serve Patient
3. Update Severity
4. Discharge Patient
5. View History
6. List Current Patients
0. Exit
Enter your choice: 4
Enter patient name to discharge: sonu
Patient not found.

--- Hospital Emergency Room Dispatcher ---
1. Add Patient
2. Serve Patient
3. Update Severity
4. Discharge Patient
5. View History
6. List Current Patients
0. Exit
Enter your choice: 5
Discharged/Served Patients:
Name: Ajith, Age: 20, Condition: headche, Severity: 4
Name: Sonu, Age: 24, Condition: stomach pain, Severity: 6

--- Hospital Emergency Room Dispatcher ---
1. Add Patient
2. Serve Patient
3. Update Severity
4. Discharge Patient
5. View History
6. List Current Patients
0. Exit
Enter your choice: 6
No current patients.

--- Hospital Emergency Room Dispatcher ---
1. Add Patient
2. Serve Patient
3. Update Severity
4. Discharge Patient
5. View History
6. List Current Patients
0. Exit
Enter your choice: 0
Exiting...
PS C:\Users\hp\OneDrive\Desktop\PROJECTS\HospitalER>

##### Concepts Practiced
Object-Oriented Programming (OOP)

Java Collections Framework

Priority-based queue handling

Command-line interface application

Separation of concerns using classes

###### Improvements You Can Add
✅ JavaFX or Swing GUI version

✅ File persistence (e.g., using serialization or a database)

✅ REST API with Spring Boot

✅ Web frontend (HTML/CSS/JS)

✅ WhatsApp/SMS notifications via Twilio


##### Author 
R M AJITH KUMAR
Java Developer | Computer Science Student