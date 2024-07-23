package org.scoula;

import java.util.Objects;

public class UserVo {
    private int id;
    private String email;
    private String password;

    public UserVo(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public UserVo(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserVo userVo = (UserVo) o;
        return id == userVo.id && Objects.equals(email, userVo.email) && Objects.equals(password, userVo.password);
    }
}
