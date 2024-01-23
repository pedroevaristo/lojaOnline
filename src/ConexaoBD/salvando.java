package ConexaoBD;
import Cliente.cadastros;


import java.sql.Connection;
import java.sql.PreparedStatement;

public class salvando{
   public void save(cadastros cadastro){
       String sql = "insert into registro(nome, sobrenome, cep, email, senha) values (?,?,?,?,?)";

       Connection conexao = null;
       PreparedStatement pstm = null;

       try {
            conexao = conexaoBD.conexao();
       }catch (){
   }
}
