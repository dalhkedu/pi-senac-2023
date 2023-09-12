package br.com.universidade.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pessoas")
public class PessoaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeCompleto = request.getParameter("nome-completo");
        System.out.println(nomeCompleto);
        request.getRequestDispatcher("index.html").forward(request, response);
    }
}
