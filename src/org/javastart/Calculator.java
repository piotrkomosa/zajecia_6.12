package org.javastart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/calculator")
public class Calculator extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstNumber = request.getParameter("firstNumber");
        String secondNumber = request.getParameter("secondNumber");
        String operation = request.getParameter("operation");

        int first;
        int second;
        String operationToPrint ="";
        int result=0;

        try {
            first = Integer.parseInt(firstNumber);
            second = Integer.parseInt(secondNumber);
        }catch ( NumberFormatException e){
            System.out.println("Bład");
            return;
        }

        switch (operation){
        case "ADD":
            result = first + second;
           operationToPrint="+";
            break;
        case "SUB":
            result = first - second;
            operationToPrint="-";
            break;
        case "MUL":
            result = first * second;
            operationToPrint="x";
            break;
        case "DIV":
            result = first / second;
            operationToPrint="/";
            break;
        default:

    }


    }
}

