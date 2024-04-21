package inheritance;

import java.util.List;

public class Mentor extends User {
    private List<Student> mentess;
    private String description;

    public List<Student> getMentess() {
        return mentess;
    }

    public void setMentess(List<Student> mentess) {
        this.mentess = mentess;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}

// getter and setter
// getMentees() {}

// setMentess(List<Student> students) {}- sets the list of mentees for this
// mentor, should
// throw an exception if there are any students in the list that do not
