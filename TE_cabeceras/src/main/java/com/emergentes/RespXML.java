
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespXML", urlPatterns = {"/RespXML"})
public class RespXML extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/xml;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
           out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>"); 
           out.println("<CATALOG>"); 
           out.println("<CD>"); 
           out.println("<TITULO>Nieve Roja</TITULO>"); 
           out.println("<ARTISTA>Elizabeth Gutierrez</ARTISTA>"); 
           out.println("<ORIGEN>AR</ORIGEN>"); 
           out.println("<PRECIO>10.99</PRECIO>"); 
           out.println("<AÑO>2010</AÑO>"); 
           out.println("</CD>"); 
           out.println("<CD>"); 
           out.println("<TITULO>El sonido del Silencio</TITULO>"); 
           out.println("<ARTISTA>Elizabeth Gutierrez</ARTISTA>"); 
           out.println("<ORIGEN>AR</ORIGEN>"); 
           out.println("<PRECIO>5.99</PRECIO>"); 
           out.println("<AÑO>2015</AÑO>"); 
           out.println("</CD>"); 
           out.println("</CATALOG>"); 
        }finally{
            out.close();
        }
    }
}
