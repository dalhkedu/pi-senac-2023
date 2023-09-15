package br.com.universidade.model;

import java.util.Objects;

public class FornecedorModel {

    private String nomeFornecedor;
    private String telefoneFornecedor;
    private String emailFornecedor;
    private String enderecoFornecedor;
    private String cnpjFornecedor;
    private String razaoSocialFornecedor;
    private String categoriaFornecedor;

    public FornecedorModel(String nomeFornecedor, String telefoneFornecedor, String emailFornecedor, String enderecoFornecedor, String cnpjFornecedor, String razaoSocialFornecedor, String categoriaFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
        this.telefoneFornecedor = telefoneFornecedor;
        this.emailFornecedor = emailFornecedor;
        this.enderecoFornecedor = enderecoFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
        this.razaoSocialFornecedor = razaoSocialFornecedor;
        this.categoriaFornecedor = categoriaFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getTelefoneFornecedor() {
        return telefoneFornecedor;
    }

    public void setTelefoneFornecedor(String telefoneFornecedor) {
        this.telefoneFornecedor = telefoneFornecedor;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }

    public String getEnderecoFornecedor() {
        return enderecoFornecedor;
    }

    public void setEnderecoFornecedor(String enderecoFornecedor) {
        this.enderecoFornecedor = enderecoFornecedor;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public String getRazaoSocialFornecedor() {
        return razaoSocialFornecedor;
    }

    public void setRazaoSocialFornecedor(String razaoSocialFornecedor) {
        this.razaoSocialFornecedor = razaoSocialFornecedor;
    }

    public String getCategoriaFornecedor() {
        return categoriaFornecedor;
    }

    public void setCategoriaFornecedor(String categoriaFornecedor) {
        this.categoriaFornecedor = categoriaFornecedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FornecedorModel that = (FornecedorModel) o;
        return Objects.equals(nomeFornecedor, that.nomeFornecedor) &&
                Objects.equals(telefoneFornecedor, that.telefoneFornecedor) &&
                Objects.equals(emailFornecedor, that.emailFornecedor) &&
                Objects.equals(enderecoFornecedor, that.enderecoFornecedor) &&
                Objects.equals(cnpjFornecedor, that.cnpjFornecedor) &&
                Objects.equals(razaoSocialFornecedor, that.razaoSocialFornecedor) &&
                Objects.equals(categoriaFornecedor, that.categoriaFornecedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeFornecedor, telefoneFornecedor, emailFornecedor, enderecoFornecedor, cnpjFornecedor, razaoSocialFornecedor, categoriaFornecedor);
    }
}
