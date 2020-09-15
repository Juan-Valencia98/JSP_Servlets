package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Operaciones", urlPatterns = {"/Operaciones"})
public class Operaciones extends HttpServlet {

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
        out.println("<h1>Operaciones</h1>");
        out.println("<form action='' method='post'>");
        out.println("1er Digito:");
        out.println("<input type ='text' name='digito1'>");
         out.println("<br>2do Digito:");
        out.println("<input type ='text' name='digito2'>");
        out.println("<select name='operaciones'>");
        out.println("<option value='1'>SUMA</option>");
        out.println("<option value='2'>RESTA</option>");                    
        out.println("<option value='3'>MULTIPLICACION</option>");
        out.println("<option value='4'>DIVISION</option>"); 
        out.println("</select>");        
        out.println("<br><input type ='submit' value = 'Procesar'>");
        out.println("");                

                        

                    
        out.println("</body>");
        out.println("</html>");
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        double digito1 = Double.parseDouble(request.getParameter("digito1"));
        double digito2 = Double.parseDouble(request.getParameter("digito2"));
        int valor = Integer.parseInt(request.getParameter("operaciones"));
        
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
     
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Operaciones</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Operaciones</h1>");
        
        switch (valor) {
            case 1:
                out.println("<p>La Suma es: "+(digito1+digito2)+"</p>");
                break;
            case 2:
                out.println("<p>La Resta es: "+(digito1-digito2)+"</p>");
                break;
            case 3:
                out.println("<p>La Multiplicacion es: "+(digito1*digito2)+"</p>");
                break;
            case 4:  
                out.println("<p>La Division es: "+(digito1/digito2)+"</p>");
                break;
            default:
                break;
        }
        out.println("</body>");
        out.println("</html>");
    }
}
