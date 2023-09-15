package br.com.universidade.model;

import java.util.Objects;

public class PessoaJuridicaModel extends PessoaModel {

    private String cnpj, razaoSocial;

    public PessoaJuridicaModel(String nome, String email, String telefone, String endereco, String cnpj, String razaoSocial) {
        super(nome, email, telefone, endereco);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public PessoaJuridicaModel(String nome, String email, String cnpj, String razaoSocial) {
        super(nome, email);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public PessoaJuridicaModel(String nome, String cnpj, String razaoSocial) {
        super(nome);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public PessoaJuridicaModel(String nome) {
        super(nome);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PessoaJuridicaModel that = (PessoaJuridicaModel) o;
        return Objects.equals(cnpj, that.cnpj) && Objects.equals(razaoSocial, that.razaoSocial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cnpj, razaoSocial);
    }

    @Override
    public String toString() {
        return "PessoaJuridicaModel{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                '}';
    }
}
