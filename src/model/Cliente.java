package model;

public class Cliente {
    private String codCliente;
    private String tipoCliente, nome_razao, cpf_cnpj, email, celular, telefone, nomeRepresentante;
    private String fk_endereco;

    public String getCodCliente() {
        return codCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public String getNome_razao() {
        return nome_razao;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public String getFk_endereco() {
        return fk_endereco;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void setNome_razao(String nome_razao) {
        this.nome_razao = nome_razao;
    }

    public Cliente() {
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    public void setFk_endereco(String fk_endereco) {
        this.fk_endereco = fk_endereco;
    }

    public Cliente(String codCliente, String tipoCliente, String nome_razao, String cpf_cnpj, String email, String celular, String telefone, String nomeRepresentante, String fk_endereco) {
        this.codCliente = codCliente;
        this.tipoCliente = tipoCliente;
        this.nome_razao = nome_razao;
        this.cpf_cnpj = cpf_cnpj;
        this.email = email;
        this.celular = celular;
        this.telefone = telefone;
        this.nomeRepresentante = nomeRepresentante;
        this.fk_endereco = fk_endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codCliente=" + getCodCliente() + ", tipoCliente=" + getTipoCliente() + ", nome_razao=" + getNome_razao() + ", cpf_cnpj=" + getCpf_cnpj() + ", email=" + getEmail() + ", celular=" + getCelular() + ", telefone=" + getTelefone() + ", nomeRepresentante=" + getNomeRepresentante() + ", fk_endereco=" + fk_endereco + '}';
    }
    
    
    
}
