package org.scoula.user;

import org.scoula.common.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ManageUserProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageUser manageUser = new ManageUser();

        while (true) {
            System.out.println("====== 회원 관리 프로그램 ======");
            System.out.println("1. 회원 목록 조회");
            System.out.println("2. 회원 추가");
            System.out.println("3. 회원 삭제");
            System.out.println("4. 특정 이름을 가지는 회원 조회");
            System.out.println("5. 프로그램 종료");
            System.out.print("원하는 작업 번호를 입력하세요 : ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                manageUser.getAllUsers();
                break;
            } else if (choice == 2) {
                System.out.print("사용자 ID : ");
                String userId = scanner.nextLine();
                System.out.print("이름 : ");
                String name = scanner.nextLine();
                System.out.print("비밀번호 : ");
                String password = scanner.nextLine();
                System.out.print("나이 : ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("멤버쉽 여부 (true/false) : ");
                boolean membership = scanner.nextBoolean();
                scanner.nextLine();

                User newUser = new User(userId, name, password, age, membership);

                manageUser.addUser(newUser);
            } else if (choice == 3) {
                System.out.print("삭제할 회원의 ID : ");
                int deletedId = scanner.nextInt();

                manageUser.deleteUserById(deletedId);
            } else if (choice == 4) {
                System.out.print("검색할 이름의 일부를 입력하세요 : ");
                String namePart = scanner.nextLine();

                manageUser.searchUsersByName(namePart);
            }
        }

        // 회원정보 입력받기
//        System.out.print("사용자 ID : ");
//        String userId = scanner.nextLine();
//        System.out.print("이름 : ");
//        String name = scanner.nextLine();
//        System.out.print("비밀번호 : ");
//        String password = scanner.nextLine();
//        System.out.print("나이 : ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("멤버쉽 여부 (true/false) : ");
//        boolean membership = scanner.nextBoolean();
//        scanner.nextLine();
//        System.out.print("삭제할 회원의 ID : ");
//        int deletedId = scanner.nextInt();

//        User newUser = new User(userId, name, password, age, membership);

//        manageUser.addUser(newUser);
//        manageUser.deleteUserById(deletedId);

    }
}
