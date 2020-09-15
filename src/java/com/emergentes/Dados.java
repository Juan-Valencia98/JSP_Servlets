package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Dados", urlPatterns = {"/Dados"})
public class Dados extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Dados</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Dados</h1>");
        out.println("<form action='' method='post'>");
        out.println("<br><input name='ope' type ='submit' value = 'Lanzar Dados'>");
        out.println("</body>");
        out.println("</html>");
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int digito1 = (int) (Math.random() * 6)+1;
        int digito2 = (int) (Math.random() * 6)+1;
        String valor = request.getParameter("ope");
        
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
     
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Dados</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Dados</h1>");
        
        if(valor.equals("Lanzar Dados")){
            out.println("<p>Dado 1-->"+digito1+"</p>");
            if(digito1==1){
                out.println("<br>|-------------|");
                out.println("<br>|-------------|");
                out.println("<br>|-----O-----|");
                out.println("<br>|-------------|");
                out.println("<br>|-------------|");
            }
            if(digito1==2){
                out.println("<br>|------------|");
                out.println("<br>|-----O-----|");
                out.println("<br>|------------|");
                out.println("<br>|-----O-----|");
                out.println("<br>|------------|");
            }
            if(digito1==3){
                out.println("<br>|-------------|");
                out.println("<br>|--------O--|");
                out.println("<br>|-----O-----|");
                out.println("<br>|--O--------|");
                out.println("<br>|-------------|");
            }
            if(digito1==4){
                out.println("<br>|-------------|");
                out.println("<br>|--O-----O--|");
                out.println("<br>|-------------|");
                out.println("<br>|--O-----O--|");
                out.println("<br>|-------------|");
            }
            if(digito1==5){
                out.println("<br>|-------------|");
                out.println("<br>|--O-----O--|");
                out.println("<br>|-----O------|");
                out.println("<br>|--O-----O--|");
                out.println("<br>|-------------|");
            }
            if(digito1==6){
                out.println("<br>|-------------|");
                out.println("<br>|--O-----O--|");
                out.println("<br>|--O-----O--|");
                out.println("<br>|--O-----O--|");
                out.println("<br>|-------------|");
            }
            out.println("<p>Dado 2-->"+digito2+"</p>");
            if(digito2==1){
                out.println("<br>|-------------|");
                out.println("<br>|-------------|");
                out.println("<br>|-----O-----|");
                out.println("<br>|-------------|");
                out.println("<br>|-------------|");
            }
            if(digito2==2){
                out.println("<br>|------------|");
                out.println("<br>|-----O-----|");
                out.println("<br>|------------|");
                out.println("<br>|-----O-----|");
                out.println("<br>|------------|");
            }
            if(digito2==3){
                out.println("<br>|-------------|");
                out.println("<br>|--------O--|");
                out.println("<br>|-----O-----|");
                out.println("<br>|--O--------|");
                out.println("<br>|-------------|");
            }
            if(digito2==4){
                out.println("<br>|-------------|");
                out.println("<br>|--O-----O--|");
                out.println("<br>|-------------|");
                out.println("<br>|--O-----O--|");
                out.println("<br>|-------------|");
            }
            if(digito2==5){
                out.println("<br>|-------------|");
                out.println("<br>|--O-----O--|");
                out.println("<br>|-----O------|");
                out.println("<br>|--O-----O--|");
                out.println("<br>|-------------|");
            }
            if(digito2==6){
                out.println("<br>|-------------|");
                out.println("<br>|--O-----O--|");
                out.println("<br>|--O-----O--|");
                out.println("<br>|--O-----O--|");
                out.println("<br>|-------------|");
            }
            out.println("<p>La Suma es: "+(digito1+digito2)+"</p>");
            if((digito1+digito2)==7 ||(digito1+digito2)==11 ){
                out.println("<h2>GANASTE!!!!</h2>");
            }else{
                out.println("<h2>PERDISTE!!!</h2>");
            
            }
        }
        
        out.println("</body>");
        out.println("</html>");
    }
}
