package lesson18;

import java.io.Serializable;

public class Person implements Serializable {

    public static final long serialVersionUID = 1L;

    private String fullName;
    private transient String password;
    private String position;

    public Person() {
    }

    public Person(String fullName, String password) {
        this.fullName = fullName;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", password='" + password + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
