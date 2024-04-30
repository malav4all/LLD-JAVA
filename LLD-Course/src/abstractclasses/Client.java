package abstractclasses;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();

        Mentor mentor = new Mentor();
        mentor.setName("test");

        User user = new Mentor();
        user.changePassword("heelo");
    }
}
