package DAO;


import Cliente.informacoes;

import java.sql.SQLException;
import java.util.List;

public interface DAO<cliente> {

    cliente encontrar(int id) throws SQLException;
    List<cliente> all() throws SQLException;

    int salvar() throws SQLException;
    int inserir() throws SQLException;
    int update() throws SQLException;
    int delete()

}