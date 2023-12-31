
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespCSV", urlPatterns = {"/RespCSV"})
public class RespCSV extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/cvs");
        response.setHeader("Content-Disposition", "attachment;filename=archivo.csv");
        PrintWriter out = response.getWriter();
        try{
            out.println("id;tnombre;apellios;edad");
            out.println("1;Elizabeth;Gutierrez;30");
            out.println("2;Helen;Alegria;31");
            out.println("3;Mauricio;Reyes;32");
        }finally{
            out.close();
        }
    }
}
