package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import ConexaoBD.conexaoBD;
import Cliente.informacoes;

public abstract class ClientImplDAO implements DAO{//Aqui seria a pasta de functions do C++
    Connection con = conexaoBD.conexao();
    informacoes info = new informacoes();

    @Override
    public int insert(informacoes cliente) throws SQLException {
        PreparedStatement statement = null;

        try{
            statement = con.prepareStatement("INSERT INTO informacoes "
                    + "(id_User, nome, sobrenome, email,  senha, cep)"
                    + "VALUES(??????)", statement.NO_GENERATED_KEYS);
            statement.setString(1, info.getNome());
            statement.setString(2, info.getNome());
            statement.setString(3, info.getSobrenome());
            statement.setString(4, info.getEmail());
            statement.setString(5, info.getSenha());
            statement.setInt(6, info.getCEP());

            int linhasAfetadas = statement.executeUpdate();

            if(linhasAfetadas > 0){
                ResultSet result = statement.getGeneratedKeys();
                if(result.next()){
                    int id = result.getInt(1);
                    info.setId_User(id);
                }
                //conexaoBD fecha o resultset fazer na pasta de conexão
                else{

                }

            }

        }catch(SQLException e){
            throw new
        }
        finally{

        }

    }

    @Override
    public int consult_by_id(Integer id) throws SQLException {
        return 0;
    }

    @Override
    public int update(informacoes cliente) throws SQLException {
        return 0;
    }

    @Override
    public int delete_by_id(Integer id) {
        return 0;
    }

    @Override
    public List<informacoes> show_all_clients() throws SQLException {
        return null;
    }
}
