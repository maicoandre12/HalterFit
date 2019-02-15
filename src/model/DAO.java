package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Cliente;

public class DAO {

    private Connection conexao;
    private String sql;
    private PreparedStatement prepararSQL;
    private Statement statement;
    public ResultSet rs;
    public Conecta bd;
    public Statement stm;
    private Cliente cliente;
    private Endereco endereco;
    private Produto produto;
    private Venda venda;
    private Usuario usuario;

    public DAO() {
        conexao = new Conecta().getConexao();
        endereco = new Endereco();
        produto = new Produto();
        venda = new Venda();
        usuario = new Usuario();
    }

    public ResultSet localizarClientes() {
        sql = "select * from tb_cliente inner join tb_endereco on fk_endereco = codEndereco order by codCliente asc";
        try {
            statement = conexao.prepareStatement(sql);
            rs = statement.executeQuery(sql);
            return rs;
        } catch (SQLException erro) {
            return null;
        }
    }

    public ResultSet localizarProdutos() {
        sql = "select * from tb_produto order by codProduto asc";
        try {
            statement = conexao.prepareStatement(sql);
            rs = statement.executeQuery(sql);
            return rs;
        } catch (SQLException erro) {
            return null;
        }
    }

    public ResultSet localizarPedidos() {
        sql = "select * from tb_venda inner join tb_endereco on fk_endereco = codEndereco inner join tb_cliente on fk_cliente = codCliente inner join tb_usuario on fk_usuario = login where statusVenda = 0 and estorno = 'N' order by codVenda asc";
        try {
            statement = conexao.prepareStatement(sql);
            rs = statement.executeQuery(sql);
            return rs;
        } catch (SQLException erro) {
            return null;
        }
    }

    public ResultSet localizarVendas() {
        sql = "select * from tb_venda inner join tb_endereco on fk_endereco = codEndereco inner join tb_cliente on fk_cliente = codCliente inner join tb_usuario on fk_usuario = login where statusVenda = 1 and estorno = 'N' order by codVenda asc";
        try {
            statement = conexao.prepareStatement(sql);
            rs = statement.executeQuery(sql);
            return rs;
        } catch (SQLException erro) {
            return null;
        }
    }

    public ResultSet localizarUsuarios() {
        sql = "select * from tb_usuario where perfil <> 0 order by perfil asc";
        try {
            statement = conexao.prepareStatement(sql);
            rs = statement.executeQuery(sql);
            return rs;
        } catch (SQLException erro) {
            return null;
        }
    }

    public boolean cadastrarUsuario(String log, String sen, int per) {
        try {
            sql = "insert into tb_usuario values (?,md5(?),?)";
            prepararSQL = conexao.prepareStatement(sql);
            prepararSQL.setString(1, log);
            prepararSQL.setString(2, sen);
            prepararSQL.setInt(3, per);
            prepararSQL.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean cadastrarCliente(String codCliente, int tipoCliente, String nome_razao, String cpf_cnpj, String email, String celular, String telefone, String nomeRepresentante, String fk_endereco) {
        try {
            sql = "insert into tb_usuario values (?,md5(?),?)";
            prepararSQL = conexao.prepareStatement(sql);
            prepararSQL.setString(1, codCliente);
            prepararSQL.setInt(2, tipoCliente);
            prepararSQL.setString(3, nome_razao);
            prepararSQL.setString(4, cpf_cnpj);
            prepararSQL.setString(5, email);
            prepararSQL.setString(6, celular);
            prepararSQL.setString(7, telefone);
            prepararSQL.setString(8, nomeRepresentante);
            prepararSQL.setString(9, fk_endereco);
            prepararSQL.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
