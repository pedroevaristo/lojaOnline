package ConexaoBD;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;

public class conexaoBD {

    private static final String url = "jdbc:mysql://localhost:3306/lojaonline";
    private static final String user = "root";
    private static final String password = "rC.)#246f+";
    private static Connection conectar = null;


    public static Connection conexao() {
        try {
            if (conectar == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(url,user,password);
            }
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Erro ao conectar com o banco de dados");

        }

        return conectar;
    }
}