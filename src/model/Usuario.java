package model;

public class Usuario {
    private String login, senha;
    private int perfil;

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public Usuario() {
    }

    public Usuario(String login, String senha, int perfil) {
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Usuario{" + "login=" + login + ", senha=" + senha + ", perfil=" + perfil + '}';
    }
    
}
