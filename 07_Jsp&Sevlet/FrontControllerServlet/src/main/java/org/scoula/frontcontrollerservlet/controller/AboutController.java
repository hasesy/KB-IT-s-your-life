package org.scoula.frontcontrollerservlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutController implements Controller {
    @Override
    public String getView(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("msg", "컨트롤러가 전달한 메시지입니다.");
        request.setAttribute("imgSrc", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3_i7ecTTVSfyb9SxxrNV4OHSAw6athgdMDw&s");
        return "about";
    }
}
