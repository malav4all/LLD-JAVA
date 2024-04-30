package abstractclasses;

public abstract class User {
    private String name;
    private String email;
    private String password;

    private String userType;

    User(String userType) {
        this.userType = userType;
    }

    abstract void saySomething();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    void updateEmail(String newEmail) {
        this.email = newEmail;
    }

    void changePassword(String newPassword) {
        this.password = newPassword;
    }

}
