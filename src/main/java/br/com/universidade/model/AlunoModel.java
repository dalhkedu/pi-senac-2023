package br.com.universidade.model;

import java.util.Objects;

public class AlunoModel extends PessoaFisicaModel {

    private String matricula;

    public AlunoModel(String nome, String email, String telefone, String endereco, String cpf, String dataNascimento, String matricula) {
        super(nome, email, telefone, endereco, cpf, dataNascimento);
        this.matricula = matricula;
    }

    public AlunoModel(String nome, String email, String cpf, String dataNascimento, String matricula) {
        super(nome, email, cpf, dataNascimento);
        this.matricula = matricula;
    }

    public AlunoModel(String nome, String cpf, String dataNascimento, String matricula) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
    }

    public AlunoModel(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public AlunoModel(String nome) {
        super(nome);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AlunoModel that = (AlunoModel) o;
        return Objects.equals(matricula, that.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), matricula);
    }

    @Override
    public String toString() {
        return "AlunoModel{" +
                "matricula='" + matricula + '\'' +
                '}';
    }
}
