/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.Conexao;
import view.LoginView;
import dao.FuncionarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import model.Funcionario;

/**
 *
 * @author pedri
 */
public class LoginController {

    private final LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }
    
    /*
    * AUTENTICA O ACESSO ENTRE USUARIO E SENHA DIGITADO E DO BANCO DE DADOS
    */
    public void autenticarLogin() throws SQLException {

        String usuario = view.getUsuarioJTextField().getText();
        String senha = view.getSenhaJPasswordField().getText();
        
        Funcionario autenticarLoginFuncionario = new Funcionario(usuario, senha);

        Connection conexao = new Conexao().getConnection();

        FuncionarioDAO funcionarioDao = new FuncionarioDAO(conexao);

        boolean existe = funcionarioDao.autenticarLoginFuncionario(autenticarLoginFuncionario);

        if (existe) {
            System.out.println("Logado");
        } else {
            System.out.println("Usuario ou Senha invalidas");

        }
    }

}
