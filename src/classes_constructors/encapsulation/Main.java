package classes_constructors.encapsulation;

public class Main {
    public static void main(String[] args) {
        PatientRecord p1 = new PatientRecord("Alice", 28, "Flu");
        PatientRecord p2 = new PatientRecord("Bob", -3, ""); // triggers validation

        p1.displayRecord();
        p2.displayRecord();

        // Update diagnosis using setter
        p1.setDiagnosis("Recovered from Flu");
        p1.displayRecord();
    }
}
