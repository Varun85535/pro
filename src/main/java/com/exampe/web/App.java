package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class App extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Employee Details</title></head>");
        out.println("<body>");
        out.println("<h2>Employee Information</h2>");
        out.println("<p>Employee ID: 101</p>");
        out.println("<p>Employee Name: Varun</p>");
        out.println("<p>Department: DevOps</p>");
        out.println("<a href='index.html'>Back to Home</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
