package org.javastart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/helloTwo")
public class HelloServletAnnotation extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Hello Servlet2");
        request.setCharacterEncoding("UTF-8");

        String firstName = request.getParameter("firstName");
        System.out.println(firstName);
    }


}
