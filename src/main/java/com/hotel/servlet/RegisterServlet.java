package com.hotel.servlet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

      String filePath = "C:/Users/hp/Hotel-Review-System/users.xml";

        File file = new File(filePath);
        file.getParentFile().mkdirs();

        FileWriter writer = new FileWriter(file, true);

        writer.write("<user>\n");
        writer.write("<name>" + name + "</name>\n");
        writer.write("<email>" + email + "</email>\n");
        writer.write("<password>" + password + "</password>\n");
        writer.write("</user>\n");

        writer.close();

        response.sendRedirect("login.jsp");
    }
}