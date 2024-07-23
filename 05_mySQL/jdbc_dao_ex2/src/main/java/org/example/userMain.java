package org.example;

import java.util.List;

public class userMain {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        // 회원 추가, 이제는 객체를 전달
//        UserVo newUser = new UserVo(0, "tetz2", "1234");
//        userDao.addUser(newUser);

        // 회원 조회
        List<UserVo> userList = userDao.getAllUsers();

        for (UserVo user : userList) {
//            System.out.println(user);
            System.out.println("아이디는 : " + user.getId());
            System.out.println("이메일은 : " + user.getEmail());
            System.out.println("비번은 : " + user.getPassword());
        }

        // 회원 수정
//        userDao.updateUser(1, "tetz1", "1234");

        // 회원 삭제
        userDao.deleteUser(1);

        // 이름이 출력되는 회원 조회 메서드
        userDao.getAllUsersWithName();
    }
}
