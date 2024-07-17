package org.scoula.todo;

import org.scoula.lib.cli.App;
import org.scoula.lib.cli.ui.Input;
import org.scoula.lib.cli.ui.Menu;
import org.scoula.lib.cli.ui.MenuItem;
import org.scoula.todo.context.Context;
import org.scoula.todo.exception.LoginFailException;
import org.scoula.todo.service.AccountService;
import org.scoula.todo.service.LoginService;

import java.sql.SQLException;


public class TodoApp extends App {
    Menu userMenu; // 로그인한 상태의 메뉴
    Menu anonymousMenu; // 로그아웃한 상태의 메뉴

    LoginService loginService = new LoginService();
    AccountService accountService = new AccountService();

    @Override
    public void init() {
        anonymousMenu = new Menu();
        anonymousMenu.add(new MenuItem("로그인", this::login));
        anonymousMenu.add(new MenuItem("가입", accountService::join));
        anonymousMenu.add(new MenuItem("종료", this::exit));

        userMenu = new Menu();
        userMenu.add(new MenuItem("로그아웃", this::logout));
        userMenu.add(new MenuItem("종료", this::exit));

        setMenu(anonymousMenu); // 시작은 anonymousMenu 로
    }

    public void join() {

    }

    public void login() {
        try {
            loginService.login();
            setMenu(userMenu); // 메뉴 교체
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (LoginFailException e) {
            System.out.println(e.getMessage());
        }
    }

    public void logout() {
        if (Input.confirm("로그아웃 할까요?")) {
            Context.getContext().setUser(null);
            setMenu(anonymousMenu); // 메뉴 교체
        }
    }

    public static void main(final String[] args) {
        final TodoApp app = new TodoApp();
        app.run();
    }

    public void exit() {
        System.out.println("프로그램 종료");
        System.exit(0);
    }
}
