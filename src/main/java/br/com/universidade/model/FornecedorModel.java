package br.com.universidade.model;

import java.util.Objects;

public class FornecedorModel extends PessoaJuridicaModel {

    private String categoria;

    public FornecedorModel(String nome, String email, String telefone, String endereco, String cnpj, String razaoSocial, String categoria) {
        super(nome, email, telefone, endereco, cnpj, razaoSocial);
        this.categoria = categoria;
    }

    public FornecedorModel(String nome, String email, String cnpj, String razaoSocial, String categoria) {
        super(nome, email, cnpj, razaoSocial);
        this.categoria = categoria;
    }

    public FornecedorModel(String nome, String cnpj, String razaoSocial, String categoria) {
        super(nome, cnpj, razaoSocial);
        this.categoria = categoria;
    }

    public FornecedorModel(String nome, String categoria) {
        super(nome);
        this.categoria = categoria;
    }

    public FornecedorModel(String nome) {
        super(nome);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FornecedorModel that = (FornecedorModel) o;
        return Objects.equals(categoria, that.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), categoria);
    }

    @Override
    public String toString() {
        return "FornecedorModel{" +
                "categoria='" + categoria + '\'' +
                '}';
    }
}
