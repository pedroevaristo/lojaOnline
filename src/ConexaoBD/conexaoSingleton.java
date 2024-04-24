package ConexaoBD;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class conexaoSingleton {

    private static final String url = "jdbc:mysql://localhost:3306/lojaonline";
    private static final String user = "root";
    private static final String password = "rC.)#246f+";
    private static Connection conectar = null;



    public static Connection conexaodb() {
        System.out.println("Connecting...");

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

    public static Connection CloseCon(){

    }
}