package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import ConexaoBD.conexaoBD;
import Cliente.informacoes;

public abstract class ClientImplDAO implements DAO{
    Connection con = conexaoBD.conexao();
    PreparedStatement ps = null;
    ResultSet rs = null;
    @Override
    public Object encontrar(int id) throws SQLException {
        informacoes info = new informacoes();
        info.setId_User(id);
        try{

        }
        return null;
    }

    @Override
    public List all() throws SQLException {
        return null;
    }

    @Override
    public int salvar() throws SQLException {
        return 0;
    }

    @Override
    public int inserir() throws SQLException {
        return 0;
    }

    @Override
    public int update() throws SQLException {
        return 0;
    }

    @Override
    public int delete() {
        return 0;
    }
}
