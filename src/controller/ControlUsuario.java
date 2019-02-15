package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import model.DAO;
import model.Usuario;

public class ControlUsuario {

    DAO dao = new DAO();
    public ResultSet rs;

    public boolean inserirUsuario(String log, String sen, int per) {

        boolean confirmacao;
        Usuario usuario = new Usuario();
        usuario.setLogin(log);
        usuario.setSenha(sen);
        usuario.setPerfil(per);

        confirmacao = dao.cadastrarUsuario(usuario.getLogin(), usuario.getSenha(), usuario.getPerfil());
        return confirmacao;
        
    }
}
