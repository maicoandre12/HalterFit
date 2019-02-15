package model;

public class Endereco {
   private String codEndereco;
   private String cep, cidade, logradouro, bairro, complemento, numero, uf;

    public String getCodEndereco() {
        return codEndereco;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getNumero() {
        return numero;
    }

    public String getUf() {
        return uf;
    }

    public void setCodEndereco(String codEndereco) {
        this.codEndereco = codEndereco;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Endereco() {
    }

    public Endereco(String codEndereco, String cep, String cidade, String logradouro, String bairro, String complemento, String numero, String uf) {
        this.codEndereco = codEndereco;
        this.cep = cep;
        this.cidade = cidade;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.complemento = complemento;
        this.numero = numero;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Endereco{" + "codEndereco=" + codEndereco + ", cep=" + cep + ", cidade=" + cidade + ", logradouro=" + logradouro + ", bairro=" + bairro + ", complemento=" + complemento + ", numero=" + numero + ", uf=" + uf + '}';
    }
   
   
}
