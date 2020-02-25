package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Funcionario;

public class FuncionarioDAO {

    private final Connection conexaoFuncionario;

    public FuncionarioDAO(Connection conexao) {
        this.conexaoFuncionario = conexao;
    }

    /*
    * INSERIR FUNCIONARIO  AO BANCO DE DADOS
     */
    public void insert(Funcionario funcionario) throws SQLException {

        String text = funcionario.getNome();

        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getNome() + "');";
        } else {
            //Nome nao pode ficar vazio
        }

        text = funcionario.getUsuario();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getUsuario() + "');";
        }

        text = funcionario.getDataContradado();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getDataContradado() + "');";
        }

        text = funcionario.getEndereco();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getEndereco() + "');";
        }

        text = funcionario.getBairro();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getBairro() + "');";
        }

        text = funcionario.getUf();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getUf() + "');";
        }

        text = funcionario.getCidade();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getCidade() + "');";
        }

        text = funcionario.getEmail();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getEmail() + "');";
        }

        double numDouble = funcionario.getComissao();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getComissao() + "');";
        }

        int numInt = funcionario.getCelularUm();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getCelularUm() + "');";
        }

        numInt = funcionario.getCelularDois();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getCelularDois() + "');";
        }

        numInt = funcionario.getCep();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getCep() + "');";
        }

        numDouble = funcionario.getSalario();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getSalario() + "');";
        }

        numInt = funcionario.getCpf();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getCpf() + "');";
        }

        numInt = funcionario.getRg();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getRg() + "');";
        }

        text = funcionario.getEndereco();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getEndereco() + "');";
        }

        numInt = funcionario.getPermissao();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getPermissao() + "');";
        }

        text = funcionario.getUsuario();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getUsuario() + "');";
        }

        text = funcionario.getSenha();
        if (!"".equals(text)) {
            String sql = "insert into funcionario(nome) values('" + funcionario.getSenha() + "');";
        }

        String sql = "insert into funcionario(usuario,senha) values('Roberto','123');";

        PreparedStatement statement = conexaoFuncionario.prepareStatement(sql);
        statement.execute();

    }

    public boolean autenticarLoginFuncionario(Funcionario funcionario) throws SQLException {

        String sql = "select * from funcionario where username = '" + funcionario.getUsuario() + "' and senha = '" + funcionario.getSenha() + "';";
        PreparedStatement statement = conexaoFuncionario.prepareStatement(sql);
        statement.execute();

        ResultSet resultSet = statement.getResultSet();

        return resultSet.next();

    }

}
