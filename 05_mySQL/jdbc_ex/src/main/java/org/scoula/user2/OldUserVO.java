package org.scoula.user2;

import java.sql.Timestamp;
import java.util.Objects;

public class UserVO {
    private final int id;
    private final String userId;
    private final String name;
    private final String password;
    private final int age;
    private final boolean membership;
    private final Timestamp signupDate;

    public UserVO(int id, String userId, String name, String password, int age, boolean membership, Timestamp signupDate) {
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

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public boolean isMembership() {
        return membership;
    }

    public Timestamp getSignupDate() {
        return signupDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserVO userVO = (UserVO) o;
        return id == userVO.id && age == userVO.age && membership == userVO.membership && Objects.equals(userId, userVO.userId) && Objects.equals(name, userVO.name) && Objects.equals(password, userVO.password) && Objects.equals(signupDate, userVO.signupDate);
    }

    
}
