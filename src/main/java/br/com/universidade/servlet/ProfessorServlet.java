package br.com.universidade.servlet;

import br.com.universidade.dao.SistemaGestaoEscolarDao;
import br.com.universidade.model.ProfessorModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/professores")
public class ProfessorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");
        System.out.println(nome);
        ProfessorModel pessoa = new ProfessorModel(nome);
        new SistemaGestaoEscolarDao().cadastrarProfessor(pessoa);
        request.getRequestDispatcher("index.html").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<ProfessorModel> list = new SistemaGestaoEscolarDao().getProfessores();
        request.setAttribute("professores", list);
        request.getRequestDispatcher("listaProfessor.jsp").forward(request, response);
    }
}
