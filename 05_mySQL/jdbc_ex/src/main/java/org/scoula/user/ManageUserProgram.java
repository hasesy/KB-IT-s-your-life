package org.scoula.user;

import java.util.Objects;
import java.util.Scanner;

public class ManageUserProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageUser manageUser = new ManageUser();

        while (true) {
            System.out.println("회원 관리 프로그램에 오신 것을 환영합니다.");
            System.out.println("로그인을 해주십시오.");
            System.out.print("ID : ");
            String userId = scanner.nextLine();
            System.out.print("password : ");
            String password = scanner.nextLine();

            boolean result = manageUser.login(userId, password);
            if (result) break;
            else {
                System.out.println("로그인 정보가 잘못되었습니다. 다시 시도하십시오.");
            }
        }

        while (true) {
            System.out.println("====== 회원 관리 프로그램 ======");
            System.out.println("1. 회원 목록 조회");
            System.out.println("2. 회원 추가");
            System.out.println("3. 회원 삭제");
            System.out.println("4. 특정 이름을 가지는 회원 조회");
            System.out.println("5. 회원 정보 수정");
            System.out.println("6. 프로그램 종료");
            System.out.print("원하는 작업 번호를 입력하세요 : ");
            String choice = scanner.nextLine();

            if (Objects.equals(choice, "1")) {
                manageUser.getAllUsers();
            } else if (Objects.equals(choice, "2")) {
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
            } else if (Objects.equals(choice, "3")) {
                System.out.print("삭제할 회원의 ID : ");
                int deletedId = scanner.nextInt();

                manageUser.deleteUserById(deletedId);
            } else if (Objects.equals(choice, "4")) {
                System.out.print("검색할 이름의 일부를 입력하세요 : ");
                String namePart = scanner.nextLine();

                manageUser.searchUsersByName(namePart);
            } else if (Objects.equals(choice, "5")) {
                System.out.print("수정할 회원의 ID를 입력하세요 : ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("새 이름 : ");
                String newName = scanner.nextLine();
                System.out.print("새 비밀번호 : ");
                String newPassword = scanner.nextLine();
                System.out.print("새 나이 : ");
                int newAge = scanner.nextInt();
                scanner.nextLine();
                System.out.print("새 멤버쉽 여부 (true/false) : ");
                boolean newMembership = scanner.nextBoolean();
                scanner.nextLine();

                User user = new User(newName, newPassword, newAge, newMembership);

                manageUser.userUpdate(user, id);
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
