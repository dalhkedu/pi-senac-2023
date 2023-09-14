package br.com.universidade.servlet;

import br.com.universidade.dao.PessoaDao;
import br.com.universidade.model.PessoaModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/pessoas")
public class PessoaServlet extends HttpServlet {

    /**
     * Post onde deve ser mapeado as variaveis enviadas pelo POST dos formularios
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nomeCompleto = request.getParameter("nome-completo");
        System.out.println(nomeCompleto);
        PessoaModel pessoa = new PessoaModel(nomeCompleto);
        new PessoaDao().cadastrarPessoa(pessoa);
        request.getRequestDispatcher("index.html").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<PessoaModel> pessoaModelList = new PessoaDao().consultaPessoas();
        request.setAttribute("pessoas", pessoaModelList);
        request.getRequestDispatcher("listaPessoa.jsp").forward(request, response);
    }
}
