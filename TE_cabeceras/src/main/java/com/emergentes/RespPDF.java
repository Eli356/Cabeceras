
package com.emergentes;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RespPDF", urlPatterns = {"/RespPDF"})
public class RespPDF extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/pdf");
        String pdfFilePath = "E:\\ejer netbeens\\TE_cabeceras\\src\\main\\webapp\\pdfs\\PRACTICASERVLET.pdf";
        InputStream inputStream = getServletContext().getResourceAsStream(pdfFilePath);
            response.setContentLengthLong(inputStream.available());
            OutputStream outputStream = response.getOutputStream();
            int bytesRead;
        byte[] buffer = new byte[4096];
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
          inputStream.close();
        outputStream.close();
    }
}
