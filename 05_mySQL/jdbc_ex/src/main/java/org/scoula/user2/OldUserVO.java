package org.scoula.user2;

import java.sql.Timestamp;
import java.util.Objects;

public class OldUserVO {
    private final int id;
    private final String userId;
    private final String name;
    private final String password;
    private final int age;
    private final boolean membership;
    private final Timestamp signupDate;

    public OldUserVO(int id, String userId, String name, String password, int age, boolean membership, Timestamp signupDate) {
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
        OldUserVO oldUserVO = (OldUserVO) o;
        return id == oldUserVO.id && age == oldUserVO.age && membership == oldUserVO.membership && Objects.equals(userId, oldUserVO.userId) && Objects.equals(name, oldUserVO.name) && Objects.equals(password, oldUserVO.password) && Objects.equals(signupDate, oldUserVO.signupDate);
    }
}
