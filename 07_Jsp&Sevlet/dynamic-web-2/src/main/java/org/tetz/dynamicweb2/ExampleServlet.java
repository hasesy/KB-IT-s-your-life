package org.tetz.dynamicweb2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ex1")
public class ExampleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // MIME 타입 설정
        response.setContentType("text/html;charset=UTF-8");

        // 자바 I/O
        PrintWriter out = response.getWriter();

        // html 작성 및 출력
        out.print("<html><body>");
        out.print("<h1>오셨습니까?!</h1>");
        out.print("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}