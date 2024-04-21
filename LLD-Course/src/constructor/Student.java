package constructor;

public class Student {
    String name;
    String address = "No Address"; // Default Value Set
    String email;
    String batch;
    double psp;
    String state;

    // Constructor in Java
    Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Student() {
    }

    // Copy Constructor
    Student(Student other) {
        name = other.name;
        email = other.email;
        psp = other.psp;
        state = other.state;

    }

    void changeBatch(String newBatch) {
        this.batch = newBatch;
    }

    void pauseCourse() {
        this.state = "PAUSED";
    }
}
