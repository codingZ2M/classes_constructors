package classes_constructors.encapsulation;

//  Encapsulation: Hiding internal object state and exposing access via controlled methods.. How are we going to achieve it?
// Bundling data (attributes) and methods (functions) that operate on the data into a single unit.
// Restricts direct access to some of the object's components via access modifiers.
public class PatientRecord {
    // 🔐 Fields are private (Encapsulation)
    private String name;
    private int age;
    private String diagnosis;

    // ✅ Constructor
    public PatientRecord(String name, int age, String diagnosis) {
        this.setName(name);         // using setter ensures validation
        this.setAge(age);
        this.setDiagnosis(diagnosis);
    }

    // ✅ Getter for name
    public String getName() {
        return name;
    }

    // ✅ Setter for name
    // Separating Concerns: By encapsulating internal logic, users only deal with the interface, not how it works.
    // Ex: The caller doesn't worry about validation, formatting, or triggering events — it just calls setValue(x).
    //     The setter method encapsulates that internal logic, separating the concern of “what happens when a value is set” from the call
    
    // Reduces Interdependency: When details are hidden, other parts of the program don’t rely on internal workings, 
    // reducing coupling. This makes code easier to change, test independently.
    
    // Improves Maintainability: Encapsulation allows internal changes without affecting external code that depends on the public interface.
    
    // Supports Modular Design: Each class handles only its specific concern, encapsulating its logic.
    // Encourages single responsibility principle—a key aspect of separation of concerns.
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name input");
        }
    }

    // ✅ Getter for age
    public int getAge() {
        return age;
    }

    
    // ✅ Setter for age with validation
    // Separating Concerns: By encapsulating internal logic, users only deal with the interface, not how it works.
    public void setAge(int age) {
        if (age > 0 && age < 130) {
            this.age = age;
        } else {
            System.out.println("Invalid age: " + age);
        }
    }

    // ✅ Getter for diagnosis
    public String getDiagnosis() {
        return diagnosis;
    }

    // ✅ Setter for diagnosis
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    // 🖨️ Display method
    public void displayRecord() {
        System.out.println("Patient: " + name);
        System.out.println("Age: " + age);
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("------------------------------");
    }
}

