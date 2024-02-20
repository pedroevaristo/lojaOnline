package ConexaoBD;
import Cliente.informacoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class salvando{
   public void salvando(){
       informacoes informacao = new informacoes();

       String sql = "insert into registro(nome, sobrenome, cep, email, senha) values (?,?,?,?,?)";

       Connection conexao = null;
       PreparedStatement pstm = null;

       try {
           conexao = conexaoBD.conexao();


           pstm = (PreparedStatement) conexao.prepareStatement(sql);

           pstm.setString(1, informacao.getNome());
           pstm.setString(2, informacao.getSobrenome());
           pstm.setString(3, informacao.getCEP());
           pstm.setString(4, informacao.getEmail());
           pstm.setString(5, informacao.getSenha());

           pstm.execute();
        } catch (SQLException e) { //qual a diferença entre Exception e e SQLEXception
           //throw new RuntimeException(e);
           System.out.println("Problemas no registro de informações no banco de dados");

       }finally{
           try {
               if(pstm != null){
                pstm.close();
               }
               if(conexao != null){
                   conexao.close();
               }

           } catch (SQLException e) {
               throw new RuntimeException(e);
           }
       }
   }}
