package tech.pt_studio.pojo;

public class User {
    private Integer proid;
    private String username;
    private String password;

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "proid=" + proid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
