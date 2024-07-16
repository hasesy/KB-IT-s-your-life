package org.scoula.user;

import java.sql.Timestamp;

public class User {
    private int id;
    private String userId;
    private String name;
    private String password;
    private int age;
    private boolean membership;
    private Timestamp signupDate;

    public User(String userId, String name, String password, int age, boolean membership) {
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.age = age;
        this.membership = membership;
    }

    public User(int id, String userId, String name, String password, int age, boolean membership, Timestamp signupDate) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.password = password;
        this.age = age;
        this.membership = membership;
        this.signupDate = signupDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    public Timestamp getSignupDate() {
        return signupDate;
    }

    public void setSignupDate(Timestamp signupDate) {
        this.signupDate = signupDate;
    }

    @Override
    public String toString() {
        return "[" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", membership=" + membership +
                ", signupDate=" + signupDate +
                ']';
    }
}
