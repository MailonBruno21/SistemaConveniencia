package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public Connection getConnection() throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:postgresql://65.19.141.67:5432/zagonel_Conveniencia", "zagonel", "123456789");
        return conexao;
    }

}
