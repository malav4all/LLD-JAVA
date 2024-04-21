package inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.setName("Malav");
        // instructor.name = "Namam";
        instructor.setDescription("Super Cool");
        instructor.saySomething();

        User user = new User();
        // user.name = "John Doe";

        Mentor mentor = new Mentor();
        // mentor.name = "Malav";
        // mentor.description = "Cool";
        // mentor.email = "mentor@gamil.com";
    }

}
