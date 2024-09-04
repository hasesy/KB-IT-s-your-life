package org.scoula.frontcontrollerservlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements Controller{
    @Override
    public String getView(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("imgSrc", "https://images.khan.co.kr/article/2013/08/08/2013080802000339300085751.jpg");
        return "index";
    }
}
