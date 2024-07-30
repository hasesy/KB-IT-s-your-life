package org.example.crud_example;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/board")
public class BoardServlet extends HttpServlet {
    private static Connection conn = null;

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/board";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "2580";

    @Override
    public void init() throws ServletException {
        System.out.println("###### BoardServlet init() 메서드 호출, 서블릿 초기화 ######");

        String sql = "SELECT * FROM posts";

         try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             System.out.println("###### MySQL 연결 성공 ######");

             try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);) {

                 while (rs.next()) {
                     String content = rs.getString("content");
                     System.out.println(content);
                 }
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("board.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String post = request.getParameter("post");

        request.setAttribute("post", post);
        RequestDispatcher dispatcher = request.getRequestDispatcher("boardDetail.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    public void destroy() {
        try {
            conn.close();
            System.out.println("##### MySQL 접속 종료 #####");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("###### BoardServlet destroy() 메서드 호출, 서블릿 소멸! ######");
    }
}