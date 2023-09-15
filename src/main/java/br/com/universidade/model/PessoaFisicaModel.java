package br.com.universidade.model;

import java.util.Objects;

public class PessoaFisicaModel extends PessoaModel {

    private String cpf, dataNascimento;

    public PessoaFisicaModel(String nome, String email, String telefone, String endereco, String cpf, String dataNascimento) {
        super(nome, email, telefone, endereco);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public PessoaFisicaModel(String nome, String email, String cpf, String dataNascimento) {
        super(nome, email);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public PessoaFisicaModel(String nome, String cpf, String dataNascimento) {
        super(nome);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public PessoaFisicaModel(String nome) {
        super(nome);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PessoaFisicaModel that = (PessoaFisicaModel) o;
        return Objects.equals(cpf, that.cpf) && Objects.equals(dataNascimento, that.dataNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cpf, dataNascimento);
    }

    @Override
    public String toString() {
        return "PessoaFisicaModel{" +
                "cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}
