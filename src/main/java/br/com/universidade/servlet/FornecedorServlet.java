package br.com.universidade.servlet;

import br.com.universidade.dao.SistemaGestaoEscolarDao;
import br.com.universidade.model.FornecedorModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/fornecedores")
public class FornecedorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");
        System.out.println(nome);
        FornecedorModel pessoa = new FornecedorModel(nome);
        new SistemaGestaoEscolarDao().cadastrarFornecedor(pessoa);
        request.getRequestDispatcher("index.html").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<FornecedorModel> list = new SistemaGestaoEscolarDao().getFornecedores();
        request.setAttribute("fornecedores", list);
        request.getRequestDispatcher("listaFornecedor.jsp").forward(request, response);
    }
}
