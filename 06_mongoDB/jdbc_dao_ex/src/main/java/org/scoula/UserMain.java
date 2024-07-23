package org.scoula;

public class UserMain {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        // 회원 추가
//        userDao.create("tetz2", "1234");

        // 회원 조회
        userDao.getAllUsers();
    }
}
