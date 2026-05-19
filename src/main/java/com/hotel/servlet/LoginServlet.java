package com.hotel.servlet;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        File file = new File("C:/Users/hp/Hotel-Review-System/users.xml");

        if (file.exists()) {
            String content = new String(Files.readAllBytes(file.toPath()));

            if (content.contains("<email>" + email + "</email>") &&
                content.contains("<password>" + password + "</password>")) {

                response.sendRedirect("dashboard.jsp");

            } else {
                response.getWriter().println("Invalid Email or Password");
            }

        } else {
            response.getWriter().println("No users registered yet.");
        }
    }
}
