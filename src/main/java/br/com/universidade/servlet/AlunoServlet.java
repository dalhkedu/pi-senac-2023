package br.com.universidade.servlet;

import br.com.universidade.dao.SistemaGestaoEscolarDao;
import br.com.universidade.model.AlunoModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/alunos")
public class AlunoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");
        System.out.println(nome);
        AlunoModel pessoa = new AlunoModel(nome);
        new SistemaGestaoEscolarDao().cadastrarAluno(pessoa);
        request.getRequestDispatcher("index.html").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<AlunoModel> list = new SistemaGestaoEscolarDao().getAlunos();
        request.setAttribute("alunos", list);
        request.getRequestDispatcher("listaAluno.jsp").forward(request, response);
    }
}
