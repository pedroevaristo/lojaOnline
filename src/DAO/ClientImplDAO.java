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

    @Override
    public int insert(informacoes cliente) throws SQLException {
        return 0;
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
