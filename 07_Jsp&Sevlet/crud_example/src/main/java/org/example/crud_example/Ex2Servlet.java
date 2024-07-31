package org.example.crud_example;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@WebServlet("/ex2")
public class Ex2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        Boolean condition = random.nextBoolean();
        List<String> lunchList = new ArrayList<>();
        lunchList.add("햄버거");
        lunchList.add("떡볶이");
        lunchList.add("닭가슴살");

        request.setAttribute("condition", condition);
        request.setAttribute("msg1", "럭키비키!");
        request.setAttribute("msg2", "내일은 럭키비키!");
        request.setAttribute("lunchList", lunchList);

        request.getRequestDispatcher("ex2.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}