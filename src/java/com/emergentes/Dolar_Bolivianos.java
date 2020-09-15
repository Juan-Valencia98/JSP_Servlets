package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Dolar_Bolivianos", urlPatterns = {"/Dolar_Bolivianos"})
public class Dolar_Bolivianos extends HttpServlet {
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
        out.println("<h1>Convertir de Dolar a Bolivianos o Bolivianos a Dolar</h1>");
        out.println("<form action='' method='post'>");
        out.println("1er Digito:");
        out.println("<input type ='text' name='digito1'>");
        out.println("<br><input name='ope' type ='submit' value = 'Dolar'>");
        out.println("<br><input name='ope' type ='submit' value = 'Bolivianos'>");
        out.println("</body>");
        out.println("</html>");
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Double digito1 = Double.parseDouble(request.getParameter("digito1"));
        String valor = request.getParameter("ope");
        
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
     
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Saludo</title>");            
        out.println("</head>");
        out.println("<body>");
        
        
        if(valor.equals("Dolar")){
            out.println("<h1>Convertiste de Boliviano a Dolar</h1><br>");
            out.println("<p>En Dolar es: "+(digito1/6.96)+"</p>");
        }
        else if(valor.equals("Bolivianos")){
            out.println("<h1>Convertiste de Dolar a Bolivianos</h1><br>");
            out.println("<p>En Bolivianos es: "+(digito1*6.96)+"</p>");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
