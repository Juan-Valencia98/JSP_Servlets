package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Matriz", urlPatterns = {"/Matriz"})
public class Matriz extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Matriz</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Matriz</h1>");
        out.println("<form action='' method='post'>");
        out.println("Matriz de:");
        out.println("<input type ='text' name='Matriz'>");
        out.println("<input type ='submit'>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int x = Integer.parseInt(request.getParameter("Matriz"));
        int [][] M= new int[x+1][x+1];
        int cont=1;
        
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
     
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Matriz</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Matriz de "+x+"x"+x+"</h1>");
        for (int a = 1; a <= x / 2; a++) {
            for (int i = a; i <= x - a; i++) {
                M[a][i] = cont;
                cont++;
            }
            for (int i = a; i <= x - a; i++) {
                M[i][x - a + 1] = cont;
                cont++;
            }
            for (int i = x - a + 1; i >= a + 1; i--) {
                M[x - a + 1][i] = cont;
                cont++;
            }
            for (int i = x - a + 1; i >= a + 1; i--) {
                M[i][a] = cont;
                cont++;
            }
        }
        if (x % 2 == 1) {
            M[x / 2 + 1][x / 2 + 1] = cont;
        }
        for(int i=1;i<x+1;i++){
            for(int j=1;j<x+1;j++){
                out.println(","+M[i][j]);
            }
            out.println("<br>");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
