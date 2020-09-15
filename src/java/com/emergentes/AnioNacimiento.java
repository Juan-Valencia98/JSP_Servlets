package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "AnioNacimiento", urlPatterns = {"/AnioNacimiento"})
public class AnioNacimiento extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hola Mundo</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Practica 1</h1>");
        out.println("<form action='' method='post'>");
        out.println("Anio de Nacimiento:");
        out.println("<input type ='text' name='Anio'>");
        out.println("<input type ='submit'>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int Anio = Integer.parseInt(request.getParameter("Anio"));
        
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
     
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Saludo</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Practica 1</h1>");
        out.println("<p>Tu Edad es: "+(2020-Anio)+"</p>");
        out.println("</body>");
        out.println("</html>");
    }
    
}
