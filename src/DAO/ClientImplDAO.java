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
    public informacoes insert(informacoes cliente) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result =null;

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
                result = statement.getGeneratedKeys();
                if(result.next()){
                    int id = result.getInt(1);
                    info.setId_User(id);
                    return info;
                    //não sei se precisa um return
                }
                result.close();
            }

        }catch(SQLException e){
            System.out.println("Erro ao achar o id do funcionário");
        }finally {
            statement.close();
        }

    }

    @Override
    public informacoes consult_by_id(Integer id) throws SQLException {
        PreparedStatement statement = null;
        ResultSet result= null;

        try{
            statement = con.prepareStatement("SELECT informacoes.* " +"WHERE informacoes.id = ?");
            statement.setInt(1, id);
            result = statement.executeQuery();

            if(result.next()){// aqui vai ler o a proxima linha da coluna 1 ( conta apartir dai) que é o indice
                int id_found = result.getInt(1);
                String nome = result.getString(2);
                String sobrenome = result.getString(3);
                String email = result.getString(4);
                String senha = result.getString(5);
                int CEP = result.getInt(6);

                return new informacoes(id_found,nome,sobrenome,email,senha, CEP);
            }
            else {
                return null;
            }

        }catch (SQLException e){
            System.out.println("Erro ao consultar pelo id");

        }finally {
            statement.close();
            result.close();
        }

    }

    @Override
    public informacoes update(informacoes cliente) throws SQLException {
        return 0;
    }

    @Override
    public int delete_by_id(Integer id) {

        PreparedStatement statement = null;
         try{
             statement = con.prepareStatement("DELETE FROM information WHERE id = ?");
             statement.setInt(1, id);

             statement.executeUpdate();
         }
         catch (SQLException e) {
             throw new RuntimeException(e);
         }
        return 0;
    }

    @Override
    public List<informacoes> show_all_clients() throws SQLException {


        return null;
    }
}
