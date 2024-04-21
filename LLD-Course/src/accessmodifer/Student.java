package accessmodifer;

public class Student {
    public String name;
    private String address;
    public String email;
    String batch;
    double psp;
    String state;

    void changeBatch(String newBatch) {
        this.batch = newBatch;
    }

    void pauseCourse() {
        this.state = "PAUSED";
    }
}
