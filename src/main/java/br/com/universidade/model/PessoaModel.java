package br.com.universidade.model;

import java.util.Objects;

public class PessoaModel {

    private String nomeCompleto;

    public PessoaModel(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaModel that = (PessoaModel) o;
        return Objects.equals(nomeCompleto, that.nomeCompleto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCompleto);
    }
}
