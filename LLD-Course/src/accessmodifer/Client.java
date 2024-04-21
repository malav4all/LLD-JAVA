package accessmodifer;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.email = "malavnagar90@gmail.com"; // accessible as it is in the same class
        s.name = "Malav";
    }
}
