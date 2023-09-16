package br.com.universidade.dao;

import br.com.universidade.model.AlunoModel;
import br.com.universidade.model.FornecedorModel;
import br.com.universidade.model.ProfessorModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SistemaGestaoEscolarDao {

    public void cadastrarProfessor(ProfessorModel pessoa) {
        String SQL = "INSERT INTO PROFESSOR (NOME, EMAIL, DEPARTAMENTO, TELEFONE, ENDERECO) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("Sucesso na conexao");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, pessoa.getNome());
            preparedStatement.setString(2, pessoa.getEmail());
            preparedStatement.setString(3, pessoa.getDepartamento());
            preparedStatement.setString(4, pessoa.getTelefone());
            preparedStatement.setString(5, pessoa.getEndereco());

            preparedStatement.execute();
            System.out.println("Sucesso na inserção");

            connection.close();

        } catch (Exception e) {
            System.out.println("Falha no inserção");
            System.out.println(e.getMessage());
        }
    }

    public List<ProfessorModel> getProfessores() {
        String SQL = "SELECT * FROM PROFESSOR";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("Sucesso na conexao");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<ProfessorModel> pessoaModelList = new ArrayList<>();
            while (resultSet.next()) {
                String nome = resultSet.getString("NOME");
                ProfessorModel model = new ProfessorModel(nome);
                pessoaModelList.add(model);
            }

            System.out.println("Sucesso na inserção");
            connection.close();

            return pessoaModelList;

        } catch (Exception e) {
            System.out.println("Falha no inserção");
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
    }

    public void cadastrarFornecedor(FornecedorModel pessoa) {
        String SQL = "INSERT INTO FORNECEDOR (NOME, EMAIL, CNPJ, TELEFONE, ENDERECO, SOCIAL, CATEGORIA) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("Sucesso na conexao");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, pessoa.getNome());
            preparedStatement.setString(2, pessoa.getEmail());
            preparedStatement.setString(3, pessoa.getCnpj());
            preparedStatement.setString(4, pessoa.getTelefone());
            preparedStatement.setString(5, pessoa.getEndereco());
            preparedStatement.setString(6, pessoa.getRazaoSocial());
            preparedStatement.setString(7, pessoa.getCategoria());
            preparedStatement.execute();
            System.out.println("Sucesso na inserção");

            connection.close();

        } catch (Exception e) {
            System.out.println("Falha no inserção");
            System.out.println(e.getMessage());
        }
    }

    public List<FornecedorModel> getFornecedores() {
        String SQL = "SELECT * FROM FORNECEDOR";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("Sucesso na conexao");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<FornecedorModel> pessoaModelList = new ArrayList<>();
            while (resultSet.next()) {
                String nome = resultSet.getString("NOME");
                FornecedorModel model = new FornecedorModel(nome);
                pessoaModelList.add(model);
            }

            System.out.println("Sucesso na inserção");
            connection.close();

            return pessoaModelList;

        } catch (Exception e) {
            System.out.println("Falha no inserção");
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
    }

    public void cadastrarAluno(AlunoModel pessoa) {
        String SQL = "INSERT INTO ALUNO (NOME, EMAIL, CPF, MATRICULA, TELEFONE, ENDERECO, NASCIMENTO) VALUES (?, ?, ?, ?, ?, ?, ?)";
        // String SQL = "INSERT INTO ALUNO NOME VALUES (?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("Sucesso na conexao");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, pessoa.getNome());
            preparedStatement.setString(2, pessoa.getEmail());
            preparedStatement.setString(3, pessoa.getCpf());
            preparedStatement.setString(4, pessoa.getMatricula());
            preparedStatement.setString(5, pessoa.getTelefone());
            preparedStatement.setString(6, pessoa.getEndereco());
            preparedStatement.setString(7, pessoa.getDataNascimento());
            preparedStatement.execute();
            System.out.println("Sucesso na inserção");

            connection.close();

        } catch (Exception e) {
            System.out.println("Falha no inserção");
            System.out.println(e.getMessage());
        }
    }

    public List<AlunoModel> getAlunos() {
        String SQL = "SELECT * FROM ALUNO";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("Sucesso na conexao");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<AlunoModel> pessoaModelList = new ArrayList<>();
            while (resultSet.next()) {
                String nome = resultSet.getString("NOME");
                AlunoModel model = new AlunoModel(nome);
                pessoaModelList.add(model);
            }

            System.out.println("Sucesso na inserção");
            connection.close();

            return pessoaModelList;

        } catch (Exception e) {
            System.out.println("Falha no inserção");
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
    }
}
