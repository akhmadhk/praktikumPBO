public class User {
    public String username;
    public String email;
    public String password;
    public String name;


    public User(String username, String name, String email) {
        this.username = username;
        this.name = name;
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Name: " + name);
    }
}