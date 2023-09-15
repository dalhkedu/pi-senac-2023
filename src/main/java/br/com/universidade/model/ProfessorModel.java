package br.com.universidade.model;

import java.util.Objects;

public class ProfessorModel extends PessoaFisicaModel {

    private String departamento;

    public ProfessorModel(String nome, String email, String telefone, String endereco, String cpf, String dataNascimento, String departamento) {
        super(nome, email, telefone, endereco, cpf, dataNascimento);
        this.departamento = departamento;
    }

    public ProfessorModel(String nome, String email, String cpf, String dataNascimento, String departamento) {
        super(nome, email, cpf, dataNascimento);
        this.departamento = departamento;
    }

    public ProfessorModel(String nome, String cpf, String dataNascimento, String departamento) {
        super(nome, cpf, dataNascimento);
        this.departamento = departamento;
    }

    public ProfessorModel(String nome, String departamento) {
        super(nome);
        this.departamento = departamento;
    }

    public ProfessorModel(String nome) {
        super(nome);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProfessorModel that = (ProfessorModel) o;
        return Objects.equals(departamento, that.departamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), departamento);
    }

    @Override
    public String toString() {
        return "ProfessorModel{" +
                "departamento='" + departamento + '\'' +
                '}';
    }
}
