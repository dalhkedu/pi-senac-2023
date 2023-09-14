package br.com.universidade.dao;

import br.com.universidade.model.PessoaModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Metodos de cadastros e get de pessoas
 */
public class PessoaDao {

    public void cadastrarPessoa(PessoaModel pessoa) {
        String SQL = "INSERT INTO PESSOA (NOME) VALUES (?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("Sucesso na conexao");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, pessoa.getNomeCompleto());
            preparedStatement.execute();
            System.out.println("Sucesso na inserção");

            connection.close();

        } catch (Exception e) {
            System.out.println("Falha no inserção");
            System.out.println(e.getMessage());
        }
    }

    public List<PessoaModel> consultaPessoas() {
        String SQL = "SELECT * FROM PESSOA";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("Sucesso na conexao");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<PessoaModel> pessoaModelList = new ArrayList<>();
            while (resultSet.next()) {
                String nome = resultSet.getString("NOME");
                PessoaModel pessoaModel = new PessoaModel(nome);
                pessoaModelList.add(pessoaModel);
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
