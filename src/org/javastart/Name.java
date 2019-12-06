package org.javastart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet("/welcome")
public class Name extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Optional<String> firstNameOptional = Optional.ofNullable(request.getParameter("firstName"));
        Optional<String> lastNameOptional =  Optional.ofNullable(request.getParameter("lastName"));
        Optional<String> ageOptional =  Optional.ofNullable(request.getParameter("age"));

        String firstNameSentence = firstNameOptional
                .map(name -> "Czesc " + name + ".")
                .orElse("Jak masz na imie?");

        String lastNameSentence = lastNameOptional
                .map(surname -> "wiem ze na nazwisko" + surname)
                .orElse("Nie wiem jak masz na nazwisko");

        String ageSentnece = ageOptional
                .map(age -> "kiedyś tez miałem " + age + "lat")
                .orElse("nie wiem ile masz lat");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println( firstNameSentence+lastNameSentence+ageSentnece);
    }
}
