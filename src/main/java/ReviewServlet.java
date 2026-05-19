package com.hotel.servlet;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/review")
public class ReviewServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String hotelName = request.getParameter("hotelName");
        String rating = request.getParameter("rating");
        String review = request.getParameter("review");

        File file = new File("C:/Users/hp/Hotel-Review-System/reviews.xml");

        FileWriter writer = new FileWriter(file, true);

        writer.write("<review>\n");
        writer.write("<hotel>" + hotelName + "</hotel>\n");
        writer.write("<rating>" + rating + "</rating>\n");
        writer.write("<comment>" + review + "</comment>\n");
        writer.write("</review>\n");

        writer.close();

        response.getWriter().println("Review Submitted Successfully! <br><a href='dashboard.jsp'>Back to Dashboard</a>");
    }
}