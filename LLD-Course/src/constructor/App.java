package constructor;

public class App {
    public static void main(String[] args) {
        Student s = new Student("Malav", "Test"); // calling the parameterized constructor
        System.out.println("Constructor Calling");

        Student Malav = new Student(s);
        System.out.println("Copy Constructor");  
    }
}
