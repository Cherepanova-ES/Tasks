package task11;

public class User {
    private String username;
    private AppSettings settings;

    public User(String username, AppSettings settings) {
        this.username = username;
        this.settings = settings;
    }

    public String getUsername() {
        return username;
    }

    public AppSettings getSettings() {
        return settings;
    }

    public void setSettings(AppSettings settings) {
        this.settings = settings;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", settings=" + settings +
                '}';
    }
}
