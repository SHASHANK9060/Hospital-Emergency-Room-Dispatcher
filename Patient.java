public class Patient implements Comparable<Patient> {
    private String name;
    private int age;
    private String condition;
    private int severity;

    public Patient(String name, int age, String condition, int severity) {
        this.name = name;
        this.age = age;
        this.condition = condition;
        this.severity = severity;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Condition: " + condition + ", Severity: " + severity;
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.severity, other.severity); // lower number = higher priority
    }
}